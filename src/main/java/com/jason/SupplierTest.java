package com.jason;

import java.util.function.Supplier;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 1;
        Integer i = supplier.get();
        System.out.println(i);
    }
}
