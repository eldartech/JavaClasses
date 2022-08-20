package switchStatement;

import java.util.Scanner;

public class Calculator {
    /*
    using Scanner and switch
    create an application which will make some arithmetic calculations:
        sum                  -> plus  or +
        subtraction          -> minus or -
        multiplication       -> multiply or *
        division             -> divide or /
        modulus              -> mod or %
    - ask first number
    - ask arithmetic operator
    - ask second number
    depending on arithmetic operator it will calculate

     */

    public static void main(String[] args) {
        Scanner object= new Scanner(System.in);
        System.out.println("Please enter fist number:");
        float num1= object.nextFloat();
        System.out.println("Please enter the operator:");
        String operator = " "+object.next()+" ";
        System.out.println("Please enter second number:");
        float num2=object.nextFloat();
        switch (operator){
            case " + ":
                float result = num1+num2;
                System.out.println(num1+operator+num2+" = "+result);
                break;
            case " - ":
                float result1 = num1-num2;
                System.out.println(num1+operator+num2+" = "+result1);
                break;
            case " * ":
                float result2 = num1*num2;
                System.out.println(num1+operator+num2+" = "+result2);
                break;
            case " / ":
                if (num2==0){
                    System.out.println("You can not divide by 0.");
                }else {
                    float result3 = num1/num2;
                    System.out.println(num1+operator+num2+" = "+result3);
                }
                break;
            case " % ":
                if (num2==0){
                    System.out.println("You can not divide by 0.");
                }else {
                    float result4 = num1 % num2;
                    System.out.println(num1 + operator + num2 + " = " + result4);
                }
                break;
            default:
                System.out.println("Invalid operator.");

        }
    }
}
