package ringo.dao;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;



import ringo.util.JDBCUtils;

/**
 * Data Access Obejct
 * 封装了针对于数据表的通用操作
 * @author ringo
 *
 */
public abstract class BaseDao<T> { // 加入泛型参数
	
	private Class<T> clazz = null; // 获取父类泛型的类
	
	// 在子类对象实例化时执行
	{
		// 获取当前BaseDao的子类继承的父类中的泛型
		Type genericSuperclass = this.getClass().getGenericSuperclass(); // 当前对象的父类
		ParameterizedType paramType = (ParameterizedType) genericSuperclass;
		
		Type[] typeArguments = paramType.getActualTypeArguments();//获取了父类的泛型参数
		clazz = (Class<T>) typeArguments[0];//泛型的第一个参数
	}
	
	/**
	 * @Description 通用的增删改操作 --支持事务
	 * @param conn
	 * @param sql
	 * @param args
	 * @return
	 */
	public int update(Connection conn, String sql, Object... args) {
		PreparedStatement prepareStatement = null;

		try {
			// 2. 预编译SQL语句，返回PreparedStament
			prepareStatement = conn.prepareStatement(sql);
			// 3.填充占位符
			for (int i = 0; i < args.length; i++) {
				prepareStatement.setObject(i + 1, args[i]);
			}
			// 4.执行SQL
			// prepareStatement.execute();
			return prepareStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭
			JDBCUtils.closeResource(null, prepareStatement); // 不关闭连接，也就不会自动提交数据
		}

		return 0;
	}
	
	
	/**
	 * Description 获取单行查询结果对象
	 * @param <T>
	 * @param conn
	 * @param clazz
	 * @param sql
	 * @param args
	 * @return
	 */
	public T getBean(Connection conn, String sql, Object ...args) {
		// 预编译SQL语句，获取PreparedStatement
		PreparedStatement prepareStatement = null;
		// 执行SQl
		ResultSet result = null;
		try {
			// 预编译SQL
			prepareStatement = conn.prepareStatement(sql);

			// 填充占位符
			for (int i = 0; i < args.length; i++) {
				prepareStatement.setObject(i + 1, args[i]);
			}

			// 获取结果集
			result = prepareStatement.executeQuery();
			// 获取结果集元数据
			ResultSetMetaData metaData = result.getMetaData();
			int columnCount = metaData.getColumnCount(); // 获取结果集的列数

			if (result.next()) {
				// 通用类
				T newInstance = clazz.newInstance(); // 获取对象
				
				for (int i = 0; i < columnCount; i++) {
					Object value = result.getObject(i + 1); // 获取列对应的值
					String columnLabel = metaData.getColumnLabel(i + 1); // 获取列的别名

					// 为对象的属性赋值
					Field declaredField = clazz.getDeclaredField(columnLabel); // 获取属性
					declaredField.setAccessible(true); // 允许访问私有属性
					declaredField.set(newInstance, value); // 为属性赋值
				}
				return newInstance;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(null, prepareStatement, result);
		}

		return null;
	}
	
	
	/**
	 * @Description 查询多行数据
	 * @param <T>
	 * @param conn
	 * @param clazz
	 * @param sql
	 * @param args
	 * @return
	 */
	public List<T> getBeanList(Connection conn, String sql, Object... args) { // 去掉泛型类型
		// 预编译SQL语句，获取PreparedStatement
		PreparedStatement prepareStatement = null;
		// 执行SQl
		ResultSet result = null;
		try {
			// 预编译SQL
			prepareStatement = conn.prepareStatement(sql);

			ArrayList<T> arrayList = new ArrayList<T>();

			// 填充占位符
			for (int i = 0; i < args.length; i++) {
				prepareStatement.setObject(i + 1, args[i]);
			}

			// 获取结果集
			result = prepareStatement.executeQuery();
			// 获取结果集元数据
			ResultSetMetaData metaData = result.getMetaData();
			int columnCount = metaData.getColumnCount(); // 获取结果集的列数

			while (result.next()) {
				// 通用类
				T newInstance = clazz.newInstance(); // 获取对象

				for (int i = 0; i < columnCount; i++) {
					Object value = result.getObject(i + 1); // 获取列值
					String columnLabel = metaData.getColumnLabel(i + 1); // 获取列的名称

					// 为对象的属性赋值
					Field declaredField = clazz.getDeclaredField(columnLabel); // 获取属性
					declaredField.setAccessible(true); // 允许访问私有属性
					declaredField.set(newInstance, value); // 为属性赋值

				}

				// 存储赋值好的对象
				arrayList.add(newInstance);
			}
			return arrayList;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(null, prepareStatement, result);
		}

		return null;
	}
	
	
	/**
	 * @Description 用于查询特殊值的特殊方法
	 * @param <E>
	 * @param conn
	 * @param sql
	 * @param args
	 * @return
	 */
	public <E> E getValue(Connection conn, String sql, Object ...args){
		PreparedStatement statement = null;
		ResultSet result = null;
		
		try {
			// 预编译SQL
			statement = conn.prepareStatement(sql);
			// 填充占位符
			for (int i = 0; i < args.length; i++) {
				statement.setObject(i + 1, i);
			}
			
			// 获取结果集
			result = statement.executeQuery();
			// 获取结果集元数据
			ResultSetMetaData metaData = result.getMetaData();
			int columnCount = metaData.getColumnCount(); // 获取结果集对象中的列数
			// 遍历结果集
			if (result.next()) {
				return (E) result.getObject(1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(null, statement, result);
		}
		
		return null;
	}
	
}
