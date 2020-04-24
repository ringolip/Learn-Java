### 函数式编程

函数式编程想尽量忽略面向对象编程的复杂语法，强调做什么，而不是以什么形式去做。



#### Lambda表达式

函数式编程思想的体现



##### 格式

(形式参数) -> {代码块}



##### Lambda表达式的使用前提

- 有一个接口

- 接口中有且仅有一个抽象方法



#### 注意事项

- 使用Lambda必须要有接口，并且要求接口中有且仅有一个抽象方法

- 必须有上下文环境，才能推导出Lambda对应的接口

  - 根据局部变量的赋值得知Lambda对应的接口

    ```java
    Runnable r = () -> System.out.println("Lambda表达式");
    ```

    

  - 根据调用方法的参数得知Lambda对应的接口

    ```java
    new Thread(() -> System.out.println("Lambda表达式")).start();
    ```



#### Lambda表达式和匿名内部类的区别





---

Java8更新大多以接口实现



#### 接口组成

- 常量

public static fifinal

- 抽象方法

public abstract

- 默认方法(Java 8)

  ```java
  public default void show3() { }
  ```

  注意事项

  - **默认方法不是抽象方法，所以不强制被重写**。但是可以被重写，重写的时候去掉default关键字

  - public可以省略，default不能省略

  

- 静态方法(Java 8)

  ```java
  public static void show() { }
  ```

  注意事项

  - **静态方法只能通过接口名调用**，不能通过实现类名或者对象名调用

  - public可以省略，static不能省略

  

- 私有方法(Java 9)

  当两个默认方法或者静态方法中包含一段相同的代码实现时，私有方法抽取相同代码。

  ```java
  private void show() { }
  ```

  ```java
  private static void method() { }
  ```

  注意事项

  - 默认方法可以调用私有的静态方法和非静态方法

  - 静态方法只能调用私有的静态方法

  - 静态方法中不能调用私有的非静态方法



---

### 方法引用

**通过方法引用来使用已经存在的方案**

方法引用是Lambda的孪生兄弟



---



#### 引用类方法

引用类方法，其实就是引用类的静态方法



**格式**

`类名::静态方法`



**使用说明**

Lamdba表达式被类方法替代的时候，他的形式参数全部传递给静态方法作为参数。

---



#### **引用对象的实例方法**

引用对象的实例方法，其实就引用类中的成员方法

```java
对象::成员方法
```



**使用说明**

Lambda表达式被对象的实例方法替代的时候，它的形式参数全部传递给该方法作为参数

---

#### 引用类的实例方法

引用类的实例方法，其实就是引用类中的成员方法

```java
类名::成员方法
```





**使用说明**

Lambda表达式被类的实例方法替代的时候 **第一个参数作为调用者** 后面的参数全部传递给该方法作为参数

---

#### 引用构造器

引用构造器，其实就是引用构造方法

```java
类名::new
```



使用说明

Lambda表达式被构造器替代的时候，它的形式参数全部传递给构造器作为参数

---

#### 函数式接口

**概念**

有且仅有一个抽象方法的接口



Java中函数式编程的体现就是Lambda表达式，所以函数式接口就是适用于Lambda使用的接口

只有确保接口中有且仅有一个抽象方法，Java的Lambda才能顺利推导。



##### 如何检测一个接口是不是函数式接口

@FunctionalInterface



#### 函数式接口作为方法的参数

如果方法的参数是一个函数式接口，我们可以使用Lambda表达式作为参数传递



#### 函数式接口作为方法的返回值

如果方法的返回值是一个函数式接口，我们可以使用Lambda表达式作为方法的返回值





---

#### Supplier接口

Supplier接口也被称为**生产型接口**

如果我们指定了接口的泛型是什么类型，那么接口中的get方法就会生产什么类型的数据供我们使用。



**方法名**

`T get()` 按照某种实现逻辑(由Lambda表达式实现)返回一个数据



---

#### Consumer

Consumer接口

Consumer接口也被称为消费型接口，它消费的数据的数据类型由泛型指定

**方法名 说明**

`void accept(T t)` 对给定的参数执行此操作

`default Consumer andThen(Consumer after)`

返回一个组合的Consumer，依次执行此操作，然后执行after操作



---

#### Predicate

Predicate接口通常用于判断参数是否满足指定的条件



boolean test(T t) 

对给定的参数进行判断(判断逻辑由Lambda表达式实现)，返回一个布尔值

default Predicate negate() 

返回一个逻辑的否定，对应逻辑非

default Predicate and(Predicate other) 

返回一个组合判断，对应短路与

default Predicate or(Predicate other) 

返回一个组合判断，对应短路或



---

#### Function

Function接口

`Function<T,R>`接口通常用于对参数进行处理，转换(处理逻辑由Lambda表达式实现)，然后返回一个新的值



```java
R apply(T t) 
```

将此函数应用于给定的参数

```java
default Function andThen(Function after)
```

返回一个组合函数，



---

### Stream流

和lambda结合使用



##### Stream流的好处

- 直接阅读代码的字面意思即可完美展示无关逻辑方式的语义

- Stream流把真正的函数式编程风格引入到Java中



##### 流的操作过程

生成流

中间操作

中介操作



#### Stream流的常见生成方式

- Collection体系集合

  使用默认方法stream()生成流， default Stream stream()

  

- Map体系集合

  把Map转成Set集合，间接的生成流

  

- 数组

  通过Stream接口的静态方法of(T... values)生成流





#### Stream流的收集操作

R collect(Collector collector) 把结果收集到集合中

