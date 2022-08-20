package inheritance.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCalculator {
    public static void main(String[] args) {
        BasicCalculator basicCalculator=new BasicCalculator();
        basicCalculator.addition(10,20);
        basicCalculator.subtraction(20,10);
        basicCalculator.multiplication(3,5);
        basicCalculator.division(10,5);
        AdvancedCalculator advancedCalculator=new AdvancedCalculator();
        advancedCalculator.calculateRemainder(123,2);
        advancedCalculator.calculatePower(2,2);
        advancedCalculator.division(100,0);
        advancedCalculator.calculateRemainder(89,0);

    }
}
