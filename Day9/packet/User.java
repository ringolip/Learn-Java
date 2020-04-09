package ringo.day09.packet;

public class User {
    private String name; // 名字
    private int balance; // 余额

    // 构造方法
    public User() {
    }

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // 显示用户信息
    public void show() {
        System.out.println("用户姓名：" + this.name + "用户余额" + this.balance);
    }
}
