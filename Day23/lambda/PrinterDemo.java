package ringo.day23.lambda;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/24 14:30
 */

//
//练习
//        1:定义一个类(PrintString)，里面定义一个方法
//public void printUpper(String s)：把字符串参数变成大写的数据，然后在控制台输出
//        2:定义一个接口(Printer)，里面定义一个抽象方法
//        void printUpperCase(String s)
//        3:定义一个测试类(PrinterDemo)，在测试类中提供两个方法
//        一个方法是：usePrinter(Printer p)
//        一个方法是主方法，在主方法中调用usePrinter方法

public class PrinterDemo {
    public static void main(String[] args) {
        // lambda表达式
        usePrinter((String s) -> {
            String result = s.toUpperCase();
            System.out.println(result);
        });

        // 引用对象的实例方法
        PrintString printString = new PrintString();
        usePrinter(printString :: printUpper);
    }

    private static void usePrinter(Printer p) {
        p.printUpperCase("hellojava");
    }
}
