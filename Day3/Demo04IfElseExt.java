// x和y的关系满足如下：
// x>=3 y = 2x + 1;
//‐1<x<3 y = 2x;
// x<=‐1 y = 2x – 1;
public class Demo04IfElseExt {
  public static void main (String[] args) {
    int x = 2;
    int y;
    if (x >= 3) {
      y = 2 * x + 1;
    } else if ( -1 < x && x < 3) {
      y = 2 * x;
    } else {
      y = 2 * x -1;
    }
    System.out.println("结果为：" + y);
  }
}
