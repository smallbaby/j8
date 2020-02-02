package com.jason;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("zhangsan", 20);
        Person p2 = new Person("abc", 30);
        Person p3 = new Person("efg", 40);
        List<Person> personList = Arrays.asList(p1, p2, p3);

        PersonTest p = new PersonTest();
        List<Person> persons = p.getPersonByUsername("zhangsan", personList);
        persons.forEach(x -> System.out.println(x.getUsername() + ":" + x.getAge()));

        List<Person> px = p.getPersonByAge1(20, personList,
                (age, pp) -> pp.stream().filter(x -> x.getAge() > age).collect(Collectors.toList()));
        System.out.println("xxx:" + px);
    }


    private List<Person> getPersonByUsername(String username, List<Person> personList) {
        return personList.stream().filter(person -> person.getUsername().equals(username)).collect(Collectors.toList());
    }

    private List<Person> getPersonByAge(int age, List<Person> personList) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (age1, ps) -> ps.stream().filter(person -> person.getAge() > age1).collect(Collectors.toList());
        return biFunction.apply(age, personList);
    }

    private List<Person> getPersonByAge1(int age, List<Person> personList, BiFunction<Integer, List<Person>, List<Person>> function) {
        return function.apply(age, personList);
    }


}
