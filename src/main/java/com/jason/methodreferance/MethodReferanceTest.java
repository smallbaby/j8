package com.jason.methodreferance;

import java.util.Arrays;
import java.util.List;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
public class MethodReferanceTest {
    public static void main(String[] args) {
        Student student = new Student("hello",10);
        Student student2 = new Student("xxx",20);
        Student student3 = new Student("a",30);
        Student student4 = new Student("b",50);
        List<Student> students = Arrays.asList(student, student2, student3, student4);

        students.sort((s1, s2) -> Student.compareStudentByScore(s1, s2));
        students.forEach(x-> System.out.println(x.getAge()));

        System.out.println("------------------");

        students.sort(Student::compareStudentByScore);
        students.forEach(x-> System.out.println(x.getAge()));

        students.sort(StudentComparator::compareStudentByScore);

        StudentComparator studentComparator = new StudentComparator();

        students.sort(studentComparator::compareStudentByName);

    }

}
