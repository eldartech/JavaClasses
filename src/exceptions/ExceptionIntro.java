package exceptions;

import java.io.IOException;

public class ExceptionIntro {
    public static void main(String[] args) throws IOException, ArithmeticException {
//        System.out.println("Before try catch block");
//       int[] numbers = {3,2,0,10};
//
//       try{
//           System.out.println(numbers[0]+numbers[2]);
//           System.out.println(numbers[numbers.length]);//ArrayIndexOutOfBoundsException
//           System.out.println(numbers[0]/numbers[2]);
//       }catch (ArrayIndexOutOfBoundsException e){
//           System.out.println(e.getMessage());
//           System.out.println(e.getCause());
//       }catch (Throwable e){
//           System.out.println(e.getMessage());
//       }finally {
//           System.out.println("this is finally block.");
//       }
//
//        System.out.println("After try catch block");
//        System.out.println("_______________________");
//       String str;
//       try {
//           str=null;
//           System.out.println(str.length());
//       }catch (NullPointerException e){
//           System.out.println(e.getClass());
//
//       }
//
//
//
//
//       try {
//           String str1="$ 33.05";
//           int num=Integer.parseInt(str1.substring(str1.indexOf("$")+1,str1.indexOf(".")));
//
//           System.out.println(num+10);
//       }catch (NumberFormatException e){
//           System.out.println(e.getMessage());
//           System.out.println(e.getClass());
//       }
//
//        System.out.println("After converting number");

        System.out.println(reverse("Java"));
    }

    public static String reverse(String str)throws IOException {
        try {
            Thread.sleep(2000);
            throw new ArithmeticException();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new StringBuilder(str).reverse().toString();
    }
}
