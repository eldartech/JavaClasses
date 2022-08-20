package arrays;

import java.util.Arrays;

public class CopyArrays {
    public static void main(String[] args) {
        ////////////////////////System.arraycopy//////////////////////
        System.out.println("System.arraycopy");
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.println(coffee + " ");
        }
        System.out.println("Arrays.copyOfRange");
        ////////////////////////Arrays.copyOfRange//////////////////////
        String[] copyFrom2 = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo2 = Arrays.copyOfRange(copyFrom2, 2, 9);
        for (String coffee : copyTo2) {
            System.out.println(coffee + " ");
        }

    }
}
