package inheritance.calculator;

public class BasicCalculator {
    /*
    adding 2 variables
    subtracting 1 variable from another one
    multiply 1 variable to another
    divide 1 variable to another

     */

    public void addition(int x, int y){
        System.out.println("The sum of "+x+" and "+y+" is "+(x+y));
    }

    public void subtraction(int x,int y){
        System.out.println("The subtraction of "+x+" and "+y+" is "+(x-y));
    }

    public void multiplication(int x,int y){
        System.out.println("The multiplication of "+x+" and "+y+" is "+(x*y));
    }

    public void division(int x, int y){
        if (y==0){
            System.out.println("you can not divide by 0");
        }else {
            System.out.println("The division of "+x+" and "+y+" is "+(x/y));
        }

    }
}
