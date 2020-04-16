package ringo.day15.dao.impl;

import ringo.day15.dao.UserDao;
import ringo.day15.pojo.User;

import java.util.ArrayList;

/**
 * 用户操作具体实现类
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/16 14:45
 */

public class UserDaoImpl implements UserDao {

    // 需要被所有对象共享
    private static ArrayList<User> array = new ArrayList<User>();

    @Override
    public void register(User user) {
        // 将用户对象存储到集合
        array.add(user);
    }

    /**
     *
     * @param userName
     * @param passWord
     */
    @Override
    public boolean isLogin(String userName, String passWord) {
        // 查看用户信息是否在集合中
        boolean flag = false;

        for (User user : array) {
            if (user.getUserName().equals(userName)
                    && user.getPassWord().equals(passWord)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
