package wrapperClasses;

import utilityMethods.ArrayMethods;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        String[] pricesArr = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i< pricesArr.length;i++){
            System.out.println("Please enter price #"+(i+1));
            pricesArr[i]=scanner.next();
        }
        ArrayMethods.printArray(pricesArr);
        System.out.println("==================");
        ArrayMethods.printArray(convertStringMoney(pricesArr));
        System.out.println("Average Price is: "+ averagePrice(convertStringMoney(pricesArr)));




    }

    static int[] convertStringMoney(String[] moneyArr){
        int[] result =new int[moneyArr.length];
        for (int j = 0; j< moneyArr.length;j++){
            if (moneyArr[j].contains("$")){
                result[j]=Integer.parseInt(moneyArr[j].replace("$",""));
            }else {
                result[j]=Integer.parseInt(moneyArr[j]);
            }
        }
        return result;
    }

    static int averagePrice(int[] nums){
        int sum = 0;
        for (int k=0; k< nums.length;k++){
            sum+=nums[k];
        }
        return sum/ nums.length;
    }
    /*
    main method of Money you will have to store users input
    in to String array, call method which will convert String array
    into int[], you will have to print average price of all prices

    write a utility method that will accept array of String with
    different prices (10$, $10,10), and this method should return
    int array of prices without $ sign
    for ex:
    sout("Please enter price 1#:)
    $12
    sout("Please enter price 2#:)
    $10
    ...

    {"$12","10$","13","$50","80$"}
    convert into
    [12,10,13,50,80]


    print out:
    average of prices

     */


}
