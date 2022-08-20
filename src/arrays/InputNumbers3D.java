package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InputNumbers3D {
    /*ask user to input 8 numbers and store them in 3 D array
    and print out array
     */
    public static void main(String[] args) {
        int[][][] numbers = new int[2][2][2];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for (int k = 0; k < numbers[i][j].length; k++) {
                    System.out.println("Please enter number for ["+i+"]["+j+"]["+k+"]");
                        numbers[i][j][k]=scanner.nextInt();
                        //numbers[0][0][0]= 122
                        //numbers[0][0][1] = 131
                        //numbers[0][1][0] = 89
                        //numbers[0][1][1] = 100
                       //numbers[1][0][0] = 89
                        //numbers[1][0][1] = 89
                        //numbers[1][1][0] = 89
                        //numbers[1][1][1] = 89
                }
            }
        }
        System.out.println(Arrays.deepToString(numbers));

        /*
        store even and odd numbers in 2 separate arrays
        int [] evenNums
        int [] oddNums
        sout:
        Even numbers: []
        Odd numbers: []
         */
        String strOddNums="";
        String strEvenNums="";
//        int countOdds=0;
        for (int i = 0;i<numbers.length;i++){
            for (int z=0;z<numbers[i].length;z++){
                for (int y=0;y<numbers[i][z].length;y++){
                    if (numbers[i][z][y]%2==0){
                        strEvenNums+=numbers[i][z][y]+",";
                    }else {
                        strOddNums+=numbers[i][z][y]+"|";
//                        countOdds++;
                    }
                }
            }
        }
//        int [] oddNums=new int[countOdds];
//        int [] evenNums=new int[8-countOdds];
        System.out.println("Even numbers: "+Arrays.toString(strEvenNums.split(",")));
        System.out.println("Odd numbers: "+Arrays.toString(strOddNums.split("\\|")));
    }
}
