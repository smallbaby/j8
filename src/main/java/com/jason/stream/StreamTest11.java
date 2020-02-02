package com.jason.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * author: zhangkai
 * date: 2020-01-29
 * description:
 */
public class StreamTest11 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hi", "Hello", "你好");
        List<String> list2 = Arrays.asList("zhangkan", "zhang1", "zhang2");

        List<String> result = list1.stream()
                .flatMap(i -> list2.stream().map(j-> i + " " + j))
                .collect(Collectors.toList());

    }
}
