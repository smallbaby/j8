package com.jason.defaultmethod;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
public interface MyInterface2 {
    default void myMethod() {
        System.out.println("2222");
    }

}
