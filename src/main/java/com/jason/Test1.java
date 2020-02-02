package com.jason;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * author: zhangkai
 * date: 2020-01-27
 * description:
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer>  list = Arrays.asList(1,2,3,4,5,6);

        list.forEach(e-> System.out.println(e));

        // method reference 方法引用
        list.forEach(System.out::println);


    }
}
