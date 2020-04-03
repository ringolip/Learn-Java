public class Demo11DoWhile {
  public static void main(String[] args) {
    // 初始化语句;
    // do {
    //   循环体;
    //   步进语句;
    // } while (条件判断);
    int i = 1;
    do {
      System.out.println("我错啦" + i);
      i++;
    } while (i <= 100);
  }
}
