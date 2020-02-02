package com.jason;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
public class PredicateTest2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        PredicateTest2 predicateTest2 = new PredicateTest2();
        predicateTest2.conditionFilter(list, x -> x > 5);

    }

    private void conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer i : list) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }
    }

    private void conditionFilter2(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        for (Integer i : list) {
            if (predicate1.and(predicate2).test(i)) {
                System.out.println(i);
            }
        }
    }

}
