package com.jason.stream;

import java.util.Arrays;
import java.util.List;

/**
 * author: zhangkai
 * date: 2020-01-29
 * description:
 */
public class StreamTest0 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "xxx");
        list.stream().filter(x->x.length() == 5).limit(1).forEach(x-> System.out.println(x.length()));

        list.stream().mapToInt(i->i.length()).filter(x->x == 5).findFirst().ifPresent(System.out::println);

        list.stream().mapToInt( i -> {
            int length = i.length();
            System.out.println(i);
            return length;
        }).filter(l -> l == 5).findFirst().ifPresent(System.out::println);
    }
}
