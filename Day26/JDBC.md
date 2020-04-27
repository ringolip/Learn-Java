#### JDBC

Java DataBase Connectivity  Java 数据库连接， Java语言操作数据库

JDBC本质

其实是官方（sun公司）定义的一套操作所有关系型数据库的规则，即接口。各个数据库厂商去实现这套接口，提

供数据库驱动jar包。我们可以使用这套接口（JDBC）编程，真正执行的代码是驱动jar包中的实现类。



---



### DriverManager：驱动管理对象

用于管理一组JDBC驱动程序的基本服务

#### 功能

1. ##### 注册驱动

   加载可用的JDBC驱动程序

   ```java
   static void registerDriver(Driver driver) //注册给定的驱动程序 DriverManager 。
   
   ```

   

   写代码使用

   ```java
   Class.forName("com.mysql.jdbc.Driver");
   ```

   

   通过查看源码发现，在com.mysql.jdbc.Driver类中存在静态代码块

   ```java
   static {
          try {
              java.sql.DriverManager.registerDriver(new Driver());
          } catch (SQLException E) {
              throw new RuntimeException("Can't register driver!");
          }
   }
   ```

   

2. ##### 获取数据库连接

   方法：

   ```java
   static Connection getConnection(String url, String user, String password) 
   ```

   参数：

   - url：指定连接的路径

     ​		语法：

     ```java
     jdbc:mysql://ip地址(域名):端口号/数据库名称
     ```

     ​		例子：

     ```java
     jdbc:mysql://localhost:3306/db3
     ```

     ​		细节：如果连接的是本机mysql服务器，并且mysql服务默认端口是3306，则url可以简写:

     ```java
     jdbc:mysql:///数据库名称
     ```

   - user：用户
   - password：密码 

   

---

### Connection 数据库连接对象

#### 功能

1. ##### 获取执行sql的对象

   ```java
   Statement createStatement()
   
   PreparedStatement prepareStatement(String sql) 
   ```

2. ##### 管理实务

   ```java
   //开启事务：
     setAutoCommit(boolean autoCommit) ：调用该方法设置参数为false，即开启事务
   //提交事务：
     commit() 
   //回滚事务：
       rollback() 
   ```

   

---

### Statement 执行SQL的对象

#### 功能

1.执行sql

- 可以执行任意的sql（了解 ）

```java
boolean execute(String sql) 
```

- 执行DML（insert、update、delete）语句、DDL(create，alter、drop)语句

```java
int executeUpdate(String sql)
```

返回值：影响的行数，可以通过这个影响的行数判断DML语句是否执行成功 返回值>0的则执行成功，反之，则失败。

- 执行DQL（select)语句

```java
ResultSet executeQuery(String sql) 
```



---

### ResultSet 结果级对象，封装查询结果

- 游标向下移动一行，判断当前行是否是最后一行末尾(是否有数据)，如果是，则返回false，如果不是则返回true

```java
boolean next()
```



* getXxx(参数):获取数据
		* Xxx：代表数据类型   如：` int getInt() ,	String getString()`
		* 参数：
			1. int：代表列的编号,从1开始   如： getString(1)
			
		   String：代表列名称。 如： getDouble("balance")
		



##### 使用步骤

1. 游标向下移动一行
2. 判断是否有数据
3. 获取数据



---







