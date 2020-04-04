package ringo.day04.demo02;

/*
方法其实就是若干语句的功能集合

参数：进入方法的数据
返回值：从方法中出来的数据

定义方法的完整格式：
修饰符 返回值类型 方法名称(参数名称) {
    方法体;
    return 返回值;
}

return两个作用：第一停止当前方法，第二将后面的返回值还给调用处

方法的三种调用格式：
1. 单独调用
2. 打印调用
3. 赋值调用
*/

public class Demo02MethodDefine {
    public static void main(String[] args) {
        int number = sum(10, 20);
        System.out.println(number);
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
}

