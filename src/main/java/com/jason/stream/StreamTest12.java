package com.jason.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * author: zhangkai
 * date: 2020-01-29
 * description:
 */
public class StreamTest12 {
    public static void main(String[] args) {
        Student s1 = new Student("zhang1", 90, 20);
        Student s2 = new Student("zhang2", 91, 22);
        Student s3 = new Student("zhang3", 85, 21);
        Student s4 = new Student("zhang1", 80, 31);
        List<Student> studentList = Arrays.asList(s1, s2, s3, s4);
        Map<String, List<Student>> map = studentList.stream()
                .collect(Collectors.groupingBy(Student::getName));

        studentList.stream().collect(Collectors.groupingBy(Student::getScore));

        Map<String, Long> map1 = studentList.stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.counting()));

        Map<String, Double> map3 = studentList.stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));

        Map<Boolean, List<Student>> map4 = studentList.stream().collect(Collectors.partitioningBy(i -> i.getScore() > 80));

        System.out.println(map4);
    }
}
