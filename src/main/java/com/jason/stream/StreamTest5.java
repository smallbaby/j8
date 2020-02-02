package com.jason.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * author: zhangkai
 * date: 2020-01-29
 * description:
 */
public class StreamTest5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "helloworld");
        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);

        // flatMap
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5));
        stream.flatMap(theList -> theList.stream()).map(i -> i*i).forEach(System.out::println);

    }
}
