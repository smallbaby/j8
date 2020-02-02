package com.jason;

import java.util.function.Predicate;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = p -> p.length()>4;
        System.out.println(predicate.test("hello"));
    }
}
