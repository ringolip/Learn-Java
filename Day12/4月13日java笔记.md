### Object类

`java.lang.Object`类是Java语言中的根类，即所有类的父类。它中描述的所有方法子类都可以使用。在对象实例化的时候，最终找的父类就是Object。

* `public String toString()`：返回该对象的字符串表示。



* `public boolean equals(Object obj)`：指示其他某个对象是否与此对象“相等”。

  - 基本数据类型比较的是值

  - 引用数据类型比较的是地址值

####  重写equals方法

比较两个对象的属性

**问题：**

隐含着一个多态

多态无法访问子类的特有内容

**解决：**

可以使用向下转型将Object类型转型为子类

---

### Objects类

在**JDK7**添加的一个Objects工具类，它提供了一些方法来操作对象

**在比较两个对象的时候，Object的equals方法容易抛出空指针异常，而Objects类中的equals方法就优化了这个问题。**

null不能调用方法，否则抛出空指针异常



---

### Date



---

### DateFormat

异常处理

throws这个异常



---

### Calendar



