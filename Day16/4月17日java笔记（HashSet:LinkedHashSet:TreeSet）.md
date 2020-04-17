### HashSet

##### 特点

不可重复、无序



##### 底层结构为哈希表

（是一个元素为链表的数组），综合了数组和链表的好处。



##### 哈希表结构底层依赖`hashCode()`和`equals()`



##### 执行顺序

首先比较哈希值是否相同，相同则执行`equals()`，不同把元素添加到集合。



---



### LinkedHashSet

元素有序唯一

底层数据结构由哈希表和链表组成



哈希表保证元素的唯一性

链表保证**元素有序**（存储和取出顺序一致）



---

### TreeSet

底层为TreeMap

保证元素的排序和唯一性

##### 底层的数据结构是红黑树

（是一个自平衡的二叉树）



##### 元素的唯一性

是根据比较的返回是否为0来决定



#### 保证元素的排序方式

使用哪种排序取决于集合的构造方法

1. **自然排序（元素具备比较性）**

   - 如果一个类的元素想要实现自然排序就要实现自然排序的接口`Comparable`

     - 重写`compareTo`方法，实现主要条件、次要条件。

       ```java
           @Override
           public int compareTo(Student o) {
               // 按照姓名长度排序
               int num = this.name.length() - o.name.length();
               int num2 = num == 0 ? (this.age - o.age) : num;
               return num2;
       //        int num = this.age - o.age;
       //        int num2 = num == 0 ? this.name.compareTo(o.name) : num;
       //        return num2;
           }
       ```

       

2. **比较器排序（集合具备比较性）**



#### 自然排序

元素具备比较性

##### 让元素所属的类实现Comparable接口



#### 比较器排序

集合具备比较性

##### 让集合构造方法接收Comparator的实现类对象



---

### Collection（背过）

#### 		|--List	有序,可重复

##### 			|--ArrayList

​				底层数据结构是数组，查询快，增删慢。
​				线程不安全，效率高

##### 			|--Vector

​				底层数据结构是数组，查询快，增删慢。
​				线程安全，效率低

##### 			|--LinkedList

​				底层数据结构是链表，查询慢，增删快。
​				线程不安全，效率高

#### 		|--Set	无序,唯一

##### 			|--HashSet

​				**底层数据结构是哈希表。**

​				如何保证元素唯一性的呢?

​					依赖两个方法：hashCode()和equals()

​					开发中自动生成这两个方法即可

##### 				|--LinkedHashSet

​					底层数据结构是链表和哈希表
​					由链表保证元素有序
​					由哈希表保证元素唯一

##### 			|--TreeSet

​				**底层数据结构是红黑树。**
​				如何保证元素排序的呢?
​					自然排序
​					比较器排序
​				如何保证元素唯一性的呢?
​					根据比较的返回值是否是0来决定



---

#### 针对Collection集合我们到底使用谁呢?(背过)

##### 	唯一吗?

- 是：Set
  - 排序吗?
    - 是：TreeSet
    - 否：HashSet



##### **如果你知道是Set，但是不知道是哪个Set，就用HashSet。**

- 否：List

  - 要安全吗？

    - 是：Vector

    - 否：ArrayList或者LinkedList

      - 查询多：ArrayList
- 增删多：LinkedList



##### 如果你知道是List，但是不知道是哪个List，就用ArrayList。

##### **如果你知道是Collection集合，但是不知道使用谁，就用ArrayList。**

如果你知道用集合，就用ArrayList。



---

#### 在集合中常见的数据结构(掌握)

​	ArrayXxx:底层数据结构是数组，查询快，增删慢

​	LinkedXxx:底层数据结构是链表，查询慢，增删快

​	HashXxx:底层数据结构是哈希表。依赖两个方法：hashCode()和equals()

​	TreeXxx:底层数据结构是二叉树。两种方式排序：自然排序和比较器排序




