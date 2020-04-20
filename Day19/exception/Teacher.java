package ringo.day19.exception;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/20 19:11
 */
public class Teacher {
    // 编译时期异常
    public void check(int score) throws MyException {
        if (score > 100 || score < 0) {
            throw new MyException();
        } else {
            System.out.println("分数没有问题");
        }
    }
}
