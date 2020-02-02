package com.jason.defaultmethod;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
public class MyClass implements MyInterface1, MyInterface2 {
    @Override
    public void myMethod() {
        MyInterface2.super.myMethod();
    }

    public static void main(String[] args) {
        MyClass m = new MyClass();
        m.myMethod();
    }
}
