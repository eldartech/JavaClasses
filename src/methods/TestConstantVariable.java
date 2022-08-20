package methods;

import stringIntro.Test;

public class TestConstantVariable {
    static final double PI = 3.141592653589793;//constant, cant reassign
    double radius = 10;
    static String FIRST_NAME="ABBY";


    public static void main(String[] args) {
        TestConstantVariable object1 = new TestConstantVariable();
        object1.sumOfNumbers(1,2);
        object1.calculateArea(90.4);
        object1.calculateArea();

    }
    static {
        FIRST_NAME="David";

    }

    {
        System.out.println("Instance Initializer Block");
    }

    TestConstantVariable(){}

    TestConstantVariable(double radius){this.radius=radius;}

    TestConstantVariable(double radius,String firstName){
        this(radius);
        this.FIRST_NAME=firstName;

    }



    double calculateArea(double radius){
        double area = radius*PI+sumOfNumbers(100,50);
       return area;
    }

    double calculateArea(){
        return PI*radius;
    }


    int sumOfNumbers(int num1, int num2){
        return num1+num2;
    }

}
