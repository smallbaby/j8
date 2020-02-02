package com.jason.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * author: zhangkai
 * date: 2020-01-29
 * description:
 */
public class StreamTest9 {
    public static void main(String[] args) {

        //
        List<String> list = new ArrayList<>(5000000);
        for (int i = 0; i < 5000000; i++) {
            list.add(UUID.randomUUID().toString());
        }

        long startTime = System.nanoTime();
        list.stream().sorted();
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        startTime = System.nanoTime();
        list.parallelStream().sorted();
        endTime = System.nanoTime();
        System.out.println(TimeUnit.NANOSECONDS.toNanos(endTime - startTime));

    }
}
