package javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2005, Month.JULY,12, 22,20,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));
        System.out.println(ChronoUnit.CENTURIES.between(aniversario, now));
        System.out.println(ChronoUnit.NANOS.between(aniversario, now));
        System.out.println(ChronoUnit.MICROS.between(aniversario, now));
        System.out.println(ChronoUnit.MILLIS.between(aniversario, now));
    }
}
