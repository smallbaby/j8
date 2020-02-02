package com.jason;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
@FunctionalInterface
interface MyInterface {
    void test();

    @Override
    String toString();
}

public class Test2 {

    private void myTest(MyInterface myInterface) {
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.myTest(new MyInterface() {
            @Override
            public void test() {
                System.out.println("123");
            }
        });

        t.myTest(() -> {
            System.out.println("hello");
        });

        MyInterface myInterface = () -> {
            System.out.println("abc");
        };
    }
}


