package recapSession;

public class RecapCasting {


    public static void main(String[] args) {

        long a = 5;
        long b = 3;

   int result = (int) (a*b);
    System.out.println(result);

        int num1 = 6;
        long num2 = 5;

         int result2 = (int)num2 + num1;
        System.out.println(result2);

       byte b1 = 3;
       byte b2 = 4;
     byte result3 = (byte)(b1-b2);
        System.out.println(  result3);
        // Everytime we use arithmetic operators with data types that are
        // smaller than integer. Java will promote data type to integer.

//
        short s1 = 3;
        short s2 = 4;
        short result4 =(short) (s1+num1+ s2);
        // What is the value of result 4?
        // If you cast decimal data types to integer or long
        // you will lose to after decimal
        // int decimal = (int)3.97;
         // What is the

    }













}
