public class Demo02DataType{
    public static void main (String[] args) {
        int num1 = (int) 100L;
        System.out.println(num1); // long-->int

        int num2 = (int) 60000000000L;
        System.out.println(num2); // long-->int 数据溢出

        int num3 = (int) 3.99;
        System.out.println(num3); // double-->int 精度损失
        
        char zifu1 = 'A';
        System.out.println(zifu1 + 1); // char类型进行数学运算
    }
}