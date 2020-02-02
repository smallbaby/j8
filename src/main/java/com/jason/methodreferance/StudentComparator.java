package com.jason.methodreferance;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
public class StudentComparator {
    public static int compareStudentByScore(Student student1, Student student2) {
        return student1.getAge() - student2.getAge();
    }

    public int compareStudentByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }
}
