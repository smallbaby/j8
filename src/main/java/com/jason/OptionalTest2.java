package com.jason;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

/**
 * author: zhangkai
 * date: 2020-01-28
 * description:
 */
public class OptionalTest2 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("hello");

        Employee employee1 = new Employee();
        employee1.setName("zhangkai");

        Company company = new Company();
        company.setEmployees(Arrays.asList(employee, employee1));

        Optional<Company> optionalCompany = Optional.ofNullable(company);

        System.out.println(optionalCompany.map(c -> c.getEmployees()).orElse(Collections.emptyList()));
    }
}
