package com.jason.stream;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * author: zhangkai
 * date: 2020-01-29
 * description:
 */
public class StreamTest6 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.generate(UUID.randomUUID()::toString);
        stringStream.findFirst().ifPresent(System.out::println);

        Stream<Integer> ll = Stream.iterate(1, i -> i + 2).limit(6);
        int a = ll.filter(x -> x > 2).mapToInt(x -> x * 2).skip(2).limit(2).sum();
        System.out.println(a);

        List<String> list = Arrays.asList("hello", "world", "xxx");
        list.stream().map(item-> {
            String result = item.substring(0, 1).toUpperCase() + item.substring(1);
            return result;
        }).forEach(System.out::println);

    }
}
