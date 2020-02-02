package com.jason;

import java.util.function.Function;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
public class FunctionTest {
    public static void main(String[] args) {

        // 传递行为
        FunctionTest t = new FunctionTest();
        int x = t.compute(1, value -> 2 * value);
        System.out.println(x);

        System.out.println(t.convert(5, i -> i + "hello"));


        Function<Integer, Integer> function = v -> v * 2;
        System.out.println(t.compute(1, function));

    }


    public int compute(int a, Function<Integer, Integer> function) {
        int result = function.apply(a);
        return result;
    }


    private String convert(int a, Function<Integer, String> function) {
        return function.apply(a);
    }

}
