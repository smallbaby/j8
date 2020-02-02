package com.jason.joda;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.util.Date;

/**
 * author: zhangkai
 * date: 2020-01-31
 * description:
 */
public class JodaTest1 {
    public static void main(String[] args) {
        DateTime today = new DateTime();
        DateTime tomorrow = today.plusDays(1);
        System.out.println(today.toString("yyyy-MM-dd"));
        System.out.println(tomorrow.toString("yyyy-MM-dd"));
        DateTime d1 = today.withDayOfMonth(1);
        System.out.println(d1.toString("yyyy-MM-dd"));

        System.out.println("--------");

        LocalDate localDate = new LocalDate();
        System.out.println(localDate);
        localDate = localDate.plusMonths(1).dayOfMonth().withMaximumValue();
        System.out.println(localDate);

        DateTime dt = new DateTime();
        DateTime dt1 = dt.minusYears(2).monthOfYear().setCopy(3).dayOfMonth().withMaximumValue();

        System.out.println(dt1.toString("yyyy-MM-dd"));

    }
}
