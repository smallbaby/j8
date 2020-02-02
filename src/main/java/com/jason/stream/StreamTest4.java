package com.jason.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * author: zhangkai
 * date: 2020-01-29
 * description:
 */
public class StreamTest4 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("a", "b", "c", "d");

        String[] strings = stringStream.toArray(length -> new String[length]);

        Arrays.asList(strings).forEach(System.out::println);
        String[] strings2 = stringStream.toArray(String[]::new);

        Stream<String> stream = Stream.of("a", "b", "c", "d");

        List<String> list = stream.collect(Collectors.toList());

        list = stream.collect(() -> new ArrayList(),
                                (theList, item) -> theList.add(item),
                                (theList, theList2) -> theList.addAll(theList2));

        list = stream.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);

        list.forEach(System.out::println);


        // 转换成指定的list
        Stream<String> stringStream1 = Stream.of("hel", "wo", "hw");
        list = stream.collect(Collectors.toCollection(ArrayList::new));

        // 转换为Set
        Set<String> set = stream.collect(Collectors.toCollection(TreeSet::new));

        String str = stringStream1.collect(Collectors.joining(",")).toString();
        System.out.println(str);

    }
}
