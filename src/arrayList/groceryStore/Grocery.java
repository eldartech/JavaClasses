package arrayList.groceryStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Grocery {
    static LinkedList<String> groceryList = new LinkedList<>(Arrays.asList("eggs", "bread", "milk", "water","butter","soda","chocolate"));

    public static void buy(ArrayList<String> purchases, String item){
        if(groceryList.remove(item)){
            System.out.println(item+" was purchased");
            purchases.add(item);
        }else{
            System.out.println("Item is not in stock");
        }
    }

    public static void returnItem(ArrayList<String> purchases, String item){
        if(purchases.contains(item)){
            groceryList.add(item);
            purchases.remove(item);
        }else{
            System.out.println("This item is not in purchase list.You can not return this item");
        }
    }

    public static void replaceItem(ArrayList<String> purchases, String newItem, String oldItem) {
        if (purchases.contains(oldItem) && groceryList.contains(newItem)) {
            purchases.remove(oldItem);
            purchases.add(newItem);
            groceryList.add(oldItem);
            groceryList.remove(newItem);
        } else {
            System.out.println("The item you want to return is not in purchases");
        }
    }


    /*
    -List of diff products
    -Methods: buy() -> removing the item from list of products
                       adding the item to the list in the store class cart purchases
              return() -> add the item back to the list of products
                          remove from the list of purchases;
              replace() -> swap one item with another(add new item to purchases and remove old item from purchases)
              also, it will remove item from the list of products and add old item back to products



     */
}
