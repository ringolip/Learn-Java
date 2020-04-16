package ringo.day15.pojo;

/**
 * 用户基本描述类
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/16 14:27
 */

public class User {
    private String userName;
    private String passWord;

    // 构造方法
    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
