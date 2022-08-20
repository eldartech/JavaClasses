package constructor.timeApp;

public class TimeTest {
    public static void main(String[] args) {
        Time time=new Time(1,2,3);
        System.out.println(time);
        time.setHour(4);
        time.setMinute(5);
        time.setSecond(6);
        System.out.println(time);
        time.setTime(58,59,23);
        System.out.println(time);
        System.out.println(time.nextSecond());
        System.out.println(time.nextSecond().nextSecond());
        System.out.println(time.previousSecond());
        System.out.println(time.previousSecond().previousSecond());


    }
}
