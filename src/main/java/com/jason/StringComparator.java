package com.jason;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
public class StringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("a", "b", "c", "d");
        /*Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(names);*/

    /*Collections.sort(names, (String o1, String o2) ->{
        return o2.compareTo(o1);
    });*/

        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));

        System.out.println(names);
    }
}
