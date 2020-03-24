public class Demo01DataType{
    public static void main(String[] args) {
        System.out.println(1024); // 整数型，默认为int
        System.out.println(3.14); // 浮点型，默认为double

        // 自动数据类型转换，规则：将取值范围小的类型转换为取值范围大的类型
        long num1 = 100;
        System.out.println(num1); // int-->long

        double num2 = 2.5F;
        System.out.println(num2); // float-->double

        float num3 = 30L;
        System.out.println(num3); // long-->float

    }
}