public class Demo15Continue {
  public static void main (String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i == 3) {
        continue;
      }
      System.out.println("我错了" + i);
    }
  }
}
