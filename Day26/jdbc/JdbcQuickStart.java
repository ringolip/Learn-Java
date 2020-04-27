package ringo.jdbc;

import java.sql.*;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/27 16:39
 */
public class JdbcQuickStart {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1.导入驱动jar包
        // 2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 3. 获取数据库连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Giant", "root", "ringo");
        // 4. 定义SQL语句
        // 5. 获取执行SQL的对象
        Statement statement = connection.createStatement();
        // 6.执行SQL
        ResultSet resultSet = statement.executeQuery("SELECT * FROM DATA");
        // 7.处理结果
        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            String age = resultSet.getString("age");

            System.out.println("编号:" + id +""
                    + "\t" + "姓名:" + name + "\t" + "年龄:"+ age + "\n" );
        }
        // 8.释放资源
        resultSet.close();
        connection.close();

    }
}
