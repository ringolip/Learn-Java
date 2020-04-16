package ringo.day15.test;

import ringo.day15.dao.UserDao;
import ringo.day15.dao.impl.UserDaoImpl;
import ringo.day15.pojo.User;

import java.util.Scanner;

/**
 * 用户测试类
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/16 15:24
 */
public class UserTest {
    public static void main(String[] args) {

        while (true) {
            // 界面
            System.out.println("************欢迎************");
            System.out.println("1. 登录");
            System.out.println("2. 注册");
            System.out.println("3. 退出");
            System.out.println("请输入你的选择");

            Scanner scanner = new Scanner(System.in);

            // 根据输入判断
            String scannerString = scanner.nextLine();
            UserDao ud = new UserDaoImpl();

            switch (scannerString) {
                case "1":
                    System.out.println("登录");
                    // 登录
                    System.out.println("---------------登录界面---------------");
                    // 输入用户名
                    System.out.println("请输入用户名：");
                    String userName = scanner.nextLine();
                    // 输入密码
                    System.out.println("请输入密码");
                    String passWord = scanner.nextLine();

                    /* 调用isLogin方法验证登录 */
                    boolean flag = ud.isLogin(userName, passWord);
                    if (flag) {
                        System.out.println("登录成功");
                        System.exit(0);
                    } else {
                        System.out.println("登录失败");
                    }
                    break;

                case "2":
                    // 注册信息
                    System.out.println("---------------注册界面---------------");
                    // 输入用户名
                    System.out.println("请输入用户名：");
                    String newUserName = scanner.nextLine();
                    // 输入密码
                    System.out.println("请输入密码");
                    String newPassWord = scanner.nextLine();
                    // 将输入信息构造为对象
                    User user = new User();
                    user.setUserName(newUserName);
                    user.setPassWord(newPassWord);

                    // 调用register方法注册
                    ud.register(user);
                    System.out.println("恭喜注册成功");
                    break;

                case "3":
                    System.out.println("退出");
                    break;
                default:
                    System.out.println("退出");
                    break;
            }
        }
    }

}
