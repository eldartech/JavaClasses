package inheritance.calculator;

public class AdvancedCalculator extends BasicCalculator{
    /*
    method to get remainder
    method to calculate power of n number 2, 4

     */
    void calculateRemainder(int x, int y){
        if (y==0){
            System.out.println("You can not divide by 0");
        }else {
            System.out.println("The remainder of "+x+ " and "+y+" is "+(x%y));
        }
    }

    void calculatePower(int x, int y){
        int result=1;
        int exponent=y;
        while (exponent!=0){
            result*=x;
            exponent--;
        }
        System.out.println(x+" to the power of "+y+" is "+result);
    }

}
