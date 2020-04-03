// 分别用三元运算符和if-else实现：取两个数字中的最大值
public class Demo06Max {
  public static void main (String[] args) {
    int a = 105;
    int b = 20;
    // 使用三元运算符
    // int max = a > b ? a : b;
    // System.out.println("最大值为：" + max);

    // 使用if-else语句
    int max;
    if (a > b) {
      max = a;
    } else {
      max = b;
    }
    System.out.println("最大值为：" + max);
  }
}
