#### 流程控制

各条语句的执行顺序是对程序的结果有直接影响的

流程图

- 顺序结构

- 判断结构
  - if, if...else, if..else if...else,

- 选择结构

  ```java
  switch (被检测量) {
    case 常量值:
      语句体;
      break;
    ...
    defalut:
      语句体;
      break;
  }
  ```

  表达式中的类型，可以是byte，short，int，char

- 循环结构

  1.初始化语句（只执行一次）

  2.条件判断

  3.循环体

  4.步进语句

  - for循环

    ```java
        for (初始化; 条件判断; 步进语句) {
          循环体;
        }
    ```

    

  - while循环

    ```java
        初始化语句;
        while (条件判断) {
          循环体;
          步进语句;
        }
        
    ```

  - do..while循环

    ```java
        初始化语句;
        do {
          循环体;
          步进语句;
        } while (条件判断);
    ```

    

    **for循环和while循环的区别：**

    - 循环次数确定使用for循环

    - 循环次数未知使用while循环



#### 跳出语句

- break

  立刻跳出整个循环

- continue

  立刻跳出本次循环剩余内容，开始下次循环



#### 嵌套循环

