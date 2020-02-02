package com.jason.methodreferance;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int compareStudentByScore(Student student1, Student student2) {
        return student1.getAge() - student2.getAge();
    }

    public static int compareStudentByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }


}
