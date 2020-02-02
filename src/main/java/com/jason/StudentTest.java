package com.jason;

import java.util.function.Supplier;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
public class StudentTest {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> new Student();
        System.out.println(studentSupplier.get().getAge());

        Supplier<Student> supplier2 = Student::new;
        System.out.println(supplier2.get());
    }
}
