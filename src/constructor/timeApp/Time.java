package constructor.timeApp;

public class Time {
    private int second;
    private int minute;
    private int hour;

    int getSecond(){
        return second;
    }

    int getMinute(){
        return minute;
    }

    int getHour(){
        return hour;
    }

    void setSecond(int second){
        if (second>=0 && second<=59){
            this.second=second;
        }else {
            this.second=0;
            System.out.println("Invalid value for second.");
        }
    }

    void setMinute(int minute){
        if (minute>=0 && minute<=59){
            this.minute=minute;
        }else {
            this.minute=minute;
            System.out.println("Invalid value for minute.");
        }
    }

    void setHour(int hour){
        if (hour>=0 && hour<=23){
            this.hour=hour;
        }else {
            this.hour=0;
            System.out.println("Invalid value for hour.");
        }
    }

    void setTime(int second, int minute, int hour){
        this.setSecond(second);
        this.setMinute(minute);
        this.setHour(hour);
    }

    Time(int second, int minute, int hour){
        this.setTime(second,minute,hour);
    }

    Time nextSecond(){
        ++second;
        if (second>=60){
            second=0;
            ++minute;
            if (minute>=60){
                minute=0;
                ++hour;
                if (hour<=0 || hour==24){
                    hour=0;
                }
            }
        }
        return this;
    }

    Time previousSecond(){
        --second;
        if (second<0){
            second=59;
            --minute;
            if (minute<0){
                minute=59;
                --hour;
                if (hour<0){
                    hour=23;
                }
            }
        }
        return this;
    }


   public String toString(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
   }
}
