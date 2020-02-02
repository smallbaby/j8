package com.jason;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
public class FunctionTest2 {
    public static void main(String[] args) {
        FunctionTest2 ft = new FunctionTest2();
        System.out.println(ft.compute(2, v -> v * 3, v -> v * v));
        System.out.println(ft.compute2(2, v -> v * 3, v -> v * v));
        System.out.println(ft.compute3(1, 2, (a, b) -> a + b));
        System.out.println(ft.compute4(1,2, (a, b) -> a - b, x->x*10));
    }


    public int compute(int a, Function<Integer, Integer> function, Function<Integer, Integer> function2) {
        return function.compose(function2).apply(a);
    }

    public int compute2(int a, Function<Integer, Integer> function, Function<Integer, Integer> function2) {
        return function.andThen(function2).apply(a);
    }

    private int compute3(int a, int b, BiFunction<Integer, Integer, Integer> function) {
        return function.apply(a, b);
    }

    private int compute4(int a, int b, BiFunction<Integer, Integer, Integer> function, Function<Integer, Integer> function2) {

        return function.andThen(function2).apply(a, b);
    }


}
