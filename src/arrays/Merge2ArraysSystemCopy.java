package arrays;

import java.util.Arrays;

public class Merge2ArraysSystemCopy {
    public static void main(String[] args) {
        String[] coffees = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };
        String[] teas = {"Earl Grey","English Breakfast","Oolong","Matcha"};
        String[] result= new String[coffees.length+teas.length];
        System.arraycopy(coffees,0,result,0,coffees.length);
        System.arraycopy(teas,0,result,coffees.length,teas.length);
        System.out.println(Arrays.toString(result));
    }
}
