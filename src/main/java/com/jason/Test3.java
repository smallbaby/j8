package com.jason;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
public class Test3 {
    public static void main(String[] args) {
        MyInterface1 i1 = () -> {}; // 不接收参数不返回值
        System.out.println(i1.getClass().getInterfaces()[0]);

        MyInterface2 i2 = () -> {};
        System.out.println(i2.getClass().getInterfaces()[0]);
        new Thread(() -> {
            System.out.println(123);
        }).start();

        List<String> list = Arrays.asList("a", "b", "c");
        list.forEach(System.out::println);
        list.forEach(i -> System.out.println(i.toUpperCase()));

        List<String> list2 = new ArrayList<>();

        list.forEach(i -> list2.add(i.toUpperCase()));
        list2.forEach(i -> System.out.println(i));


        // list.stream().map(i -> i.toUpperCase());

        list.stream().map(String::toUpperCase).forEach(i-> System.out.println(i));


        Function<String, String> function = String::toUpperCase;
        System.out.println(function.getClass().getInterfaces()[0]);













    }
}





@FunctionalInterface
interface MyInterface1 {
    void myMethod();
}

@FunctionalInterface
interface MyInterface2 {
    void myMethod2();
}
