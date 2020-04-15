package ringo.day14.arraylist;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/15 16:56
 */
public class StackSimulatorTest {
    public static void main(String[] args) {
        StackSimulator stack = new StackSimulator();

        // 创建字符串对象
        String str1 = "hello";
        String str2 = "world";
        String str3 = "java";
        String str4 = "scala";

        stack.add(str1);
        stack.add(str2);
        stack.add(str3);
        stack.add(str4);

        while (stack.isEmpty() == false) {
            System.out.println(stack.get());
        }

    }
}
