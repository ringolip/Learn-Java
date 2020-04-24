package ringo.day23.lambda;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/24 13:52
 */
//需求：
//        1:定义一个接口(Printable)：里面定义一个抽象方法：void printString(String s);
//        2:定义一个测试类(PrintableDemo)，在测试类中提供两个方法
//        一个方法是：usePrintable(Printable p)
//        一个方法是主方法，在主方法中调用usePrintable方法
public class PrintableDemo {
    public static void main(String[] args) {
        usePrintable(s -> System.out.println(s));

        usePrintable(System.out :: println);
    }

    static void usePrintable(Printabel p) {
        p.printString("爱生活，爱Java");
    }
}
