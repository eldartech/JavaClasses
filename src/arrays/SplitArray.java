package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArray {
    /*
    ask user to enter 10 Words
    split array in half
    and print out
   1st with 1st half of main array
   2nd with 2nd half of main array
   ex:
   String[] copyFrom = {
"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
"Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
"Marocchino", "Ristretto" };

print:
["Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
"Doppio", "Espresso"]
["Frappucino", "Freddo", "Lungo", "Macchiato",
"Marocchino", "Ristretto"]

     */

    public static void main(String[] args) {
        System.out.println("Enter 10 words:");
        Scanner input = new Scanner(System.in);
        String []words = new String[10];
        for(int i=0; i<words.length;i++){
            words[i]=input.next();
        }
        String[] firstHalf = new String[words.length/2];
        String[] secondHalf = new String[words.length-firstHalf.length];
        for (int q=0;q<words.length;q++){
            if (q<firstHalf.length){
                firstHalf[q]=words[q];
            }else {
                secondHalf[q-firstHalf.length]=words[q];
            }
        }
        System.out.println("First Half Array: "+Arrays.toString(firstHalf));
        System.out.println("Second Half Array: "+Arrays.toString(secondHalf));



    }















}
