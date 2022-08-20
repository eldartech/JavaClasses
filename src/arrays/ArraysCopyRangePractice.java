package arrays;

import java.util.Arrays;

public class ArraysCopyRangePractice {
    public static void main(String[] args) {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };
        String[] copyTo = Arrays.copyOfRange(copyFrom,0,copyFrom.length-1);
        for (String coffee:copyTo){
            System.out.println(coffee);


        }
    }
}
