public class Demo06Operator {
    public static void main (String[] args) {
        int num1 = 30;
        System.out.println(num1++);
        System.out.println(num1);

        int x = 10;
        int y = 30;
        int reslut = ++x + y--; // 11 + 29
        System.out.println(reslut);
        System.out.println(x);
        System.out.println(y);
    }
}