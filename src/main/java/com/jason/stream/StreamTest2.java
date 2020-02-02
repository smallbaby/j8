package com.jason.stream;

import java.util.stream.IntStream;

/**
 * author: zhangkai
 * date: 2020-01-29
 * description:
 */
public class StreamTest2 {
    public static void main(String[] args) {

        IntStream.of(new int[]{1,2,3}).forEach(System.out::println);

        // [~}
        IntStream.range(3,6).forEach(System.out::println);

        IntStream.rangeClosed(3,6).forEach(System.out::println);

        System.out.println("------------------");



    }
}
