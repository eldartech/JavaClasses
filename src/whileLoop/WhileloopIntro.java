package whileLoop;

import java.util.Scanner;

public class WhileloopIntro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        int x=name.length()-1;
        int z = 0;
        int countCaps=0;
        int countNonCaps=0;
        while (z<=x){
            if(name.charAt(z)>='A' && name.charAt(z)<='Z'){
                ++countCaps;

            }else{

                ++countNonCaps;
            }
        z++;

        }
        if(countCaps>0 && countNonCaps>0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        /*john
        j
        o
        h
        n

         */

        int i=0;//john
        while (i<=name.length()-1){//i=4
            System.out.println(name.toUpperCase().charAt(i++));//3 ->n

        }


    }
}
