### Hashtable

#### 和HashMap的区别

##### Hashtable 线程安全，效率低。不允许null键和null值。

##### HashMap 线程不安全，效率高。允许null键和null值。





---

### Collections

针对集合操作的工具类，都是静态方法。



#### Collection和Collections的区别

##### Collection是单列集合的顶层接口，有子接口List和Set

##### Collections是针对集合操作的工具类，有对集合排序和二分查找的方法。



#### 常用方法

`public static  boolean addAll(Collection c, T... elements)` :往集合中添加一些元素。

`public static void shuffle(List list) `打乱顺序 :打乱集合顺序。 

`public static  void sort(List list) `:将集合中元素按照默认规则排序。 

`public static  void sort(List list，Comparator ) `:将集合中元素按照指定规则排 序。



---

### 异常



#### 异常的体系

##### Throwable

- Error		严重问题，我们不处理。
- Exception
  - RuntimeException 运行期异常，需要修正代码
  - 非RuntimeException 编译期异常，必须处理的，否则程序编译不通过



---



#### 异常的处理

##### JVM的默认处理

把异常的名称，原因，位置等信息输出在控制台，但是程序不会再继续执行



##### 1. try..catch

**自己编写处理代码,后面的程序可以继续执行**

在try语句中发现问题后，jvm会帮我们生成一个异常对象，

然后把这个异常对象抛出，和catch里面的类进行匹配

如果该对象是某个类型的，就会执行该catch里面的处理信息



##### 2. throws

**把自己处理不了的，在方法上声明，告诉调用者，这里有问题**



##### 3. throw

用在方法内部，抛出异常对象



---

#### throw和throws的区别

**throw**

在方法体中,后面跟的是异常对象名

并且只能是一个

表示抛出异常，由方法体内的语句处理

throw抛出的是一个异常对象，说明这里肯定有一个异常产生了



**throws**

在方法声明上,后面跟的是异常的类名

可以是多个

表示抛出异常，由该方法的调用者来处理

throws是声明方法有异常，是一种可能性，这个异常并不一定会产生

---



#### 编译期异常和运行期异常的区别

编译期异常：调用者必须显示处理，否则编译不通过

运行期异常：调用者无需显示处理，也可以处理



---



#### Throwable中的常用方法

- `public void printStackTrace() `:打印异常的详细信息。 

​       包含了异常的类型,异常的原因,还包括异常出现的位置,在开发和调试阶段,都得使用printStackTrace。

- `public String getMessage()` :获取发生异常的原因。 提示给用户的时候,就提示错误原因。 

- `public String toString()` :获取异常的类型和异常描述信息(不用)。





---

### 异常处理的原则

原则：

如果该功能内部可以将问题处理，用try

如果处理不了，交由调用者处理，这时用throws

区别：

后续程序需要继续运行就用try

后续程序不需要继续运行就用throws



---

### finally

finally用于释放资源，它的代码永远会执行。

特殊情况：在执行到finally之前jvm退出了



---

### 自定义异常

- 继承Exception
- 继承RuntimeException

---

### File类

文件与目录路径名的抽象表示，用来操作文件。

- 创建功能

- - public boolean createNewFile()
  - public boolean mkdir()
  - public boolean mkdirs()

- 删除功能

- - public boolean delete()

- 重命名功能

- - public boolean renameTo(File dest)

- 获取功能

  - public String getAbsolutePath() ：返回此File的绝对路径名字符串。 

  - public String getPath() ：将此File转换为路径名字符串。 

  - public String getName() ：返回由此File表示的文件或目录的名称。 

  - public long length() ：返回由此File表示的文件的长度。

##### 文件名称过滤器



