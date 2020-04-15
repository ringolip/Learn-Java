package ringo.day14.arraylist;

import java.util.LinkedList;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/15 16:18
 */

// 模拟Stack集合
public class StackSimulator {

    private LinkedList list;

    public StackSimulator() {
        list = new LinkedList();
    }

    // 添加
    public void add(Object object) {
        list.addFirst(object);
    }

    // 获取
    public Object get() {
        return list.removeFirst();
    }

    // 为空
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
