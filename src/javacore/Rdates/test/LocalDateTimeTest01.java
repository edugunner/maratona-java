package javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2026-07-17");
        LocalTime time = LocalTime.parse("09:45:44");
        System.out.println(dateTime);
        System.out.println(time);
        System.out.println(date);
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
