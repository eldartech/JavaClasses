package vector.onlineStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShopAmazon {
    public static void main(String[] args) {
        Amazon product1=new Amazon("iPhone XIII",2,500,"Electronics");
//        System.out.println(product1);
        Amazon product2=new Amazon("Samsung TV",1,399.99,"Electronics");
        Amazon product3 = new Amazon("HP",3,450,"Electronics");
        ArrayList<Amazon> products = new ArrayList<>(Arrays.asList(product1,product2,product3));


        int answer=0;
        do {
            System.out.println("Please choose an option:" +
                    "\n1. Print All Products" +
                    "\n2. Print Price of Product"+
                    "\n3. Purchase a product"+
                    "\n4. Print product details"+
                    "\n0. Exit"
                    );
            Scanner scanner=new Scanner(System.in);
            answer=scanner.nextInt();
            switch (answer){
                case 0:
                    System.out.println("Exit an App.");
                    break;
                case 1:
                    System.out.println("Products:");
                    Amazon.printAllProducts();
                    break;
                case 2:
                    System.out.println("Please enter name of a product:");
                    Amazon.printAllProducts();
                    scanner.nextLine();// \n
                    String name=scanner.nextLine();
                    Amazon.printPriceOfProduct(name);
                    break;
                case 3:
                    System.out.println("Please enter name of a product to purchase:");
                    Amazon.printAllProducts();
                    scanner.nextLine();
                    String product=scanner.nextLine();
                    Amazon.purchase(product,products);
                    Amazon.printDetail(product,products);
                    break;
                case 4:
                    System.out.println("Please enter name of a product to print details:");
                    Amazon.printAllProducts();
                    String productName= scanner.nextLine();
                    Amazon.printDetail(productName,products);
                    break;
            }

        }while (answer!=0);
        System.out.println("Thanks for shopping with Amazon.");
    }
}
