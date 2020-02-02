package com.jason.stream;

import java.util.Arrays;
import java.util.List;

/**
 * author: zhangkai
 * date: 2020-01-29
 * description:
 */
public class StreamTest3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(list.stream().map(x -> x * 2).reduce(0, Integer::sum));
    }
}
