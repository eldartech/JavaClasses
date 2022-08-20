package recapSession;

import java.util.Scanner;

public class Test {
//    private static int $;
//
    public static void main(String[] main) {
//        String s1, s2;
//         s1 = "Java";
//         s2 = "Java";
//        String sb1 = new String ("Java");
//        String sb2=sb1;
//        System.out.println(sb1==sb2);//true
//        System.out.println(s1==sb2);//false
//        System.out.println(s1=="Java");//true
//        System.out.println(sb2=="Java");//false
//        System.out.println(s1 == s2);//true
//        System.out.println(s1.equals(s2));//true
//        System.out.println(sb1 == s1);//false
//        System.out.println(sb1.equals(s1));//true
//        System.out.println(sb2.intern()==s1);//true
//
//        ///Grade
//        int testscore=89;
//        char grade;
//        if (testscore >= 90) {
//            grade = 'A';
//        } else if (testscore >= 80) {
//            grade = 'B';
//        } else if (testscore >= 70) {
//            grade = 'C';
//        } else if (testscore >= 60) {
//            grade = 'D';
//        } else {
//            grade = 'F';
//        }
//        System.out.println("Grade = " + grade);
//
//
//        //Capital or not
//        String test="@ello";
//        if(test.charAt(0)>=65) {
//            if (test.charAt(0) <= 90)
//                System.out.println("First letter is capital");
//        }else {
//            System.out.println("First letter is not capital");
//        }
//
//            //leap year or not
//        // year to be checked
//        int year = 1996;
//        boolean leap = false;
//
//        // if the year is divided by 4
//        if (year % 4 == 0) {
//
//            // if the year is century
//            if (year % 100 == 0) {
//
//                // if year is divided by 400
//                // then it is a leap year
//                if (year % 400 == 0)
//                    leap = true;
//                else
//                    leap = false;
//            }
//
//            // if the year is not century
//            else
//                leap = true;
//        }
//
//        else
//            leap = false;
//
//        if (leap)
//            System.out.println(year + " is a leap year.");
//        else
//            System.out.println(year + " is not a leap year.");
//
//
//        //reverse int
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int x = s.nextInt();
        int first_digit = x%10;
        int second_digit = (x/10)%10;
        int third_digit = (x/100)%10;
        int fourth_digit = (x/1000)%10;
        int new_number = (first_digit*1000)+(second_digit*100)+(third_digit*10)+(fourth_digit*1);
        System.out.println(new_number);
//
//
//        //greatest int
//        int x, y, z;
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Enter first number");
//        x = s.nextInt();
//
//        System.out.println("Enter second number");
//        y = s.nextInt();
//
//        System.out.println("Enter third number");
//        z = s.nextInt();
//
//        if ((x > y) && (x > z)) {
//            System.out.println(x + " is the greatest integer");
//        } else if ((y > x) && (y > z)) {
//            System.out.println(y + " is the greatest integer");
//        } else System.out.println(z + " is the greatest integer");
//
//
    }
//
//
}
