### 反射



#### 反射获取构造方法并使用



```java
Class<?> c = Class.forName("ringo.day24.classloader.Student"); // 字节码文件对象
Constructor<?> con = c.getConstructor(); // 构造方法对象
Object obj = con.newInstance(); // 创建对象
```





#### Constructor类用于创建对象的方法

```java
T newInstance(Object...initargs) 
```

根据指定的构造方法创建对象



##### 暴力反射

使用私有构造方法

```java
declaredConstructor.setAccessible(true);
```



---



#### 反射获取成员变量并使用

```java
// 创建Class字节码文件对象
Class<?> c = Class.forName("ringo.day25.reflect.Student");

// 指定成员变量创建成员变量对象
Field address = c.getDeclaredField("address");

// 创建构造方法对象
Constructor<?> constructor = c.getConstructor(); // 无参构造方法对象
// 创建实例对象
Object obj = constructor.newInstance();
// 为成员变量对象赋值
address.set(obj, "西安");
```





---

#### 反射获取成员方法并使用



#### Method类用于执行方法的方法





#### 调用obj对象的成员方法

```java
Objectinvoke(Objectobj,Object...args)
```

参数是args,返回值是Object类型







---



### 模块化



即使程序只需要使用Java的部分核心功能， JVM也要加载整个JRE环境。 为了给Java“瘦身”，让Java实现轻量化，

Java 9正式的推出了模块化系统。Java被拆分为N多个模块，并允许Java程序可以根据需要选择加载程序必须的

Java模块，这样就可以让Java以轻量化的方式来运行



#### 模块的基本使用

- 在模块的src目录下，新建一个名为`module-info.java`的描述性文件，该文件专门定义模块名，访问权限，模块依赖等信息，描述性文件中使用模块导出和模块依赖来进行配置并使用

- 模块中所有未导出的包都是私有的，他们是不能在模块之外被访问的

  模块导出格式：exports 包名;

- 一个模块要访问其他的模块，必须明确指定依赖哪些模块，未明确指定依赖的模块不能访问

  模块依赖格式：requires 模块名;



#### 模块服务的使用

允许服务提供者在服务使用者之间完成解耦，简单的说，**就是服务使用者只面向接口编程**，但不清楚服务提供者的实现类。



Java9允许将服务接口定义在一个模块中，并使用`uses语句`来声明该服务接口，然后针对该服务接口提供不同的服务实现类，这些服务实现类可以分布在不同的模块中，服务实现模块则使用`provides语句`为服务接口指定实现类，服务使用者只需要面向接口编程即可。



#### 



---



