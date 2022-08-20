package localDateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;//wild card


public class LocalDateTimePractice {
    public static void main(String[] args) {
        System.out.println("---------now()-------");
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        System.out.println("---------");
        for (int i=0;i<10;i++){
            if (i==5){
                System.out.println(localDate.minusYears(2));
            }
        }
        System.out.println("---------LocalDate.of()-------");  // yyyy-MM-dd
        LocalDate localDate1=LocalDate.of(2014,6,15);
        System.out.println("using int: "+localDate1);
        LocalDate localDate2=LocalDate.of(2012,Month.OCTOBER,23);
        System.out.println("using Month Enum Class: "+localDate2);
        System.out.println("---------LocalTime.of()-------");//HH:mm:ss.ns
        System.out.println(LocalTime.of(2,35));
        System.out.println(LocalTime.of(2,45,15));
        System.out.println(LocalTime.of(2,45,15,35624));
        System.out.println("---------LocalDateTime.of()-------");//yyyy-MM-ddTHH:mm:ss.ns
        /*
    LocalDateTime.of(int year, int month, int dayOfMonth, int hour, int minute)
	LocalDateTime.of(int year, int month, int dayOfMonth, int hour, int minute, int second)
	LocalDateTime.of(int year, int month, int dayOfMonth, int hour, int minute, int second,int nanos)
	LocalDateTime.of(int year, Month month,int dayOfMonth, int hour, int minute)
	LocalDateTime.of(int year, Month month,int dayOfMonth, int hour, int minute, int second)
	LocalDateTime.of(int year, Month month,int dayOfMonth, int hour, int minute, int second, int nanos)
	LocalDateTime.of(LocalDate date, LocalTime)
         */
        LocalDate localDateEx=LocalDate.of(2012,Month.DECEMBER,12);
        LocalTime localTime=LocalTime.of(23,59,59,123);
        System.out.println(LocalDateTime.of(localDateEx,localTime));
        try {
            System.out.println(LocalDateTime.of(1995, 13, 26, 23, 59));
        }catch (DateTimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("---------plus()-------");
        LocalDate localDate3=LocalDate.now();
        System.out.println(localDate3);
        localDate3=localDate3.plusDays(100);
        System.out.println(localDate3);//2022-08-19
        System.out.println(localDate3.plusMonths(2));//2022-10-19
        System.out.println(localDate3.plusYears(2));//2024-08-19

        LocalTime time=LocalTime.now();
        System.out.println(time);
        time=time.plusHours(1);
        System.out.println(time);
        System.out.println(time.plusMinutes(45));
        System.out.println(time.plusSeconds(55));
        System.out.println(time.plusNanos(2000));

        LocalDateTime localDateTime=LocalDateTime.now();
        localDateTime=localDateTime.plusYears(2).plusMonths(2).plusDays(10).plusHours(2).plusMinutes(30).plusSeconds(50).plusNanos(1000);
        System.out.println(localDateTime);

        System.out.println("---------minus()-------");
        LocalDateTime localDateTime1=LocalDateTime.of(2021,12,31,23,59);

        System.out.println(localDateTime1.minusYears(1).minusMonths(11).minusDays(30).minusHours(22).minusMinutes(58));//2020-01-01T01:01
        System.out.println("---------DataTimeFormatter----------");
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        //  2020/01/01 01:01
        System.out.println(localDateTime1);
        System.out.println(localDateTime1.format(formatter));
        String date ="31/12/2021 23:59:00";
        DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime localDateTime2=LocalDateTime.parse(date, formatter1);
        System.out.println(localDateTime2);

    }
}
