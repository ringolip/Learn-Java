package ringo.item03.impl;

import ringo.item03.MyService;

/**
 * @author Ringo
 * @version 1.0
 * @date 2020/4/26 16:22
 */
public class Ringo implements MyService{
    @Override
    public void service() {
        System.out.println("学吧，学无止境");
    }
}
