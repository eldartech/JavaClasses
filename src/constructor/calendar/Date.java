package constructor.calendar;

public class Date {
    /*
  private  day
   private month
    private year

   constructor with day, month and year initialization
    method to get each instance variable
    method to set/update values of each instance variable
    method which set/update all values for instance variables
    method to print out date format of month/day/year
    12/31/2022
     */
    private int day;
    private int month;
    private int year;

    Date(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    int getDay() {
        return day;
    }

    void setDay(int day){
        this.day=day;
    }

    int getMonth(){
        return month;
    }

    void setMonth(int month){
        this.month=month;
    }

    int getYear(){
        return year;
    }

    void setYear(int year){
        this.year=year;
    }

    void setDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }



    void printDate(){
        System.out.println(month+"/"+day+"/"+year);
    }


    public String toString(){
        return month+"/"+day+"/"+year;
    }

}
