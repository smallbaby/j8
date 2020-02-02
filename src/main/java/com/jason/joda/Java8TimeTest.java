package com.jason.joda;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import java.util.TreeSet;

/**
 * author: zhangkai
 * date: 2020-01-31
 * description:
 */
public class Java8TimeTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear() + "\t" + localDate.getMonthValue());

        LocalDate localDate1 =localDate.plus(2, ChronoUnit.WEEKS);

        System.out.println(localDate1);


        LocalDate localDate2 = localDate.minus(2, ChronoUnit.WEEKS);
        System.out.println(localDate2);


        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.millis());
        boolean b = localDate2.isAfter(localDate);


        Set<String> set = ZoneId.getAvailableZoneIds();
        set.stream().forEach(System.out::println);

        Set<String> treeSet = new TreeSet<String>() {
            {
                addAll(set);
            }
        };
        treeSet.stream().forEach(System.out::println);















    }
}
