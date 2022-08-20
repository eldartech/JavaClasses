package arrayList.groceryStore;

import java.util.ArrayList;
import java.util.Scanner;

import static arrayList.groceryStore.Grocery.*;

public class Store {
    /*
    list purchases
     */
    public static void main(String[] args) {
        ArrayList<String> purchases=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        int choice=5;
        do {
            System.out.println("Select an option:\n1.Buy\n2.Return\n3.Replace\n4.Print Grocery List\n0.Exit");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Please enter an item to buy:");
                    System.out.println(groceryList);
                    String item=scanner.next();
                    buy(purchases,item);
                    break;
                case 2:
                    System.out.println("Please enter an item to return:");
                    System.out.println(purchases);
                    String itemToReturn=scanner.next();
                    returnItem(purchases,itemToReturn);
                    break;
                case 3:
                    System.out.println("Please enter item to replace: ");
                    String oldItem=scanner.next();
                    System.out.println("Please enter item to replace with:");
                    String newItem=scanner.next();
                    replaceItem(purchases,newItem,oldItem);
                    break;
                case 4:
                    System.out.println("Grocery List:");
                    for (String product:groceryList) {
                        System.out.println(product);
                    }
                    break;
            }



        }while (choice!=0);
        System.out.println("Purchases: "+purchases);
        System.out.println("Thanks for shopping with us!");
    }
}
