public class Demo02Variable{
    public static void main(String[] args) {
    // 创建一个变量
    int num1;
    // 向变量赋值
    num1 = 10;
    System.out.println(num1);       

    num1 = 20;
    System.out.println(num1);

    // 使用一步到位的格式来定义变量
    // 格式：数据类型 变量类型 = 数据值;
    int num2 = 25;
    System.out.println(num2);

    byte num3 = 30;
    System.out.println(num3);

    short num4 = 50;
    System.out.println(num4);

    long num5 = 3000000000L;
    System.out.println(num5);

    float num6 = 2.5F;
    System.out.println(num6);

    double num7 = 1.2;
    System.out.println(num7);

    char zifu1 = 'A';
    System.out.println(zifu1);
    
    zifu1 = '中';
    System.out.println(zifu1);

    boolean var1 = false;
    System.out.println(var1);

    var1 = true;
    System.out.println(var1);

    boolean var2 = var1;
    System.out.println(var2);
    }
}