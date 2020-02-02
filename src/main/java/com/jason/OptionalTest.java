package com.jason;

import java.util.Optional;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("hell");
        optional.ifPresent(System.out::println);
    }
}

