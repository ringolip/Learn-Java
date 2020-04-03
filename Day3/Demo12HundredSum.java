// 求1-100所有偶数的和
public class Demo12HundredSum {
  public static void main (String[] args) {
    int sum = 0;
    // for (int i = 1; i <= 100; i++) {
    //   if (i % 2 == 0) {
    //     sum += i;
    //   }
    // }

    // int i = 1;
    // while (i <= 100) {
    //   if (i % 2 == 0) {
    //     sum += i;
    //   }
    //   i++;
    // }

    int i = 1;
    do {
      if (i % 2 == 0) {
        sum += i;
      }
      i++;
    } while (i <= 100);
    
    System.out.println("1-100所有偶数的和为：" + sum);
  }
}
