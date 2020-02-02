package com.jason.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

/**
 * author: zhangkai
 * date: 2020-01-29
 * description:
 */
public class StreamTest1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 60);
        Student s3 = new Student("wangwu", 79);
        Student s4 = new Student("zhaoliu", 90);
        List<Student> list = Arrays.asList(s1, s2, s3, s4);

        List<Student> students = list.stream().collect(toList());
        Collector c;
        students.forEach(System.out::println);

        Long a = students.stream().collect(counting());
        System.out.println(a);

    }
}
