package ringo.item03.impl;

import ringo.item03.MyService;

/**
 * @author Ringo
 * @version 1.0
 * @date 2020/4/26 16:23
 */
public class Kun implements MyService{
    @Override
    public void service() {
        System.out.println("多少个植树节过去了，实现你的诺言呢");
    }
}
