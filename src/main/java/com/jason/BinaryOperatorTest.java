package com.jason;

import java.util.function.BinaryOperator;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperatorTest binaryOperatorTest = new BinaryOperatorTest();

        int a = binaryOperatorTest.compute(1,2, (x1, x2) -> x1 + x2);
        System.out.println(a);
    }

    private int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }
}
