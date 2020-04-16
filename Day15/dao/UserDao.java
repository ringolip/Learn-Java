package ringo.day15.dao;

import ringo.day15.pojo.User;

/**
 * 用户操作接口
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/16 14:30
 */
public interface UserDao {

    // 注册
    /**
     *
     * @param user
     * @return
     */
    public abstract void register(User user);

    // 登录
    /**
     *
     * @param userName
     * @param passWord
     */
    abstract boolean isLogin(String userName, String passWord);

}
