package localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class IntroDateTime {
    public static void main(String[] args) {

        //not possible: LocalDate localDate=new LocalDate();

        LocalDate today=LocalDate.now();//format: yyyy-MM-dd
        //current date
        //returning object
        //cant instantiate, since LocalDate constructor is private and can't create object out of it
        System.out.println(today);

        LocalTime time=LocalTime.now();//hh:mm:ss.nanoseconds
        //current time
        //returning object
        //cant instantiate, since LocalTime constructor is private and can't create object out of it

        System.out.println(time);

        LocalDateTime localDateTime=LocalDateTime.now();
        //current date and time
        //returning object
        //cant instantiate, since LocalDateTime constructor is private and can't create object out of it

        System.out.println(localDateTime);
        System.out.println(changeFormat(localDateTime));
        //LocalDate.of(year, month(int),date)
        //LocalDate.of(yyyy, Month.month,date)

        LocalDate localDate=LocalDate.of(1991,8,1);//1991-08-01
        System.out.println(localDate);
        LocalDate localDate1=LocalDate.of(1991, Month.SEPTEMBER,01);//1991-09-01
        System.out.println(localDate1);

    }
    public static String changeFormat(LocalDateTime localDateTime){
        return localDateTime.toString().replace("-","/").replace("T"," ");
    }
}
