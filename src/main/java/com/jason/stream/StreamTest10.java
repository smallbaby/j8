package com.jason.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * author: zhangkai
 * date: 2020-01-29
 * description:
 */
public class StreamTest10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello a", "hello b", "hello c");

        List<String[]> result = list.stream()
                .map(i -> i.split(" "))
                .distinct()
                .collect(Collectors.toList());

        result.forEach(i -> Arrays.asList(i).forEach(System.out::println));

        list.stream()
                .map(i -> i.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);


    }
}
