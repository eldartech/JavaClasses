package vector.onlineStore;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Amazon {
    private String productName;
    private int inventory;
    private double price;
    private String category;

    static Vector<String> productNames=new Vector<>();//{iphone,samsung
    static Vector<Double> productPrices=new Vector<>();//200,100
    static Vector<Integer> productInventory=new Vector<>();//5, 3

    public String getProductName() {
        return productName;
    }

    public int getInventory() {
        return inventory;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setProductName(String productName) {
        this.productName = productName;
        productNames.add(productName);
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
        productInventory.add(inventory);
    }

    public void setPrice(double price) {
        this.price = price;
        productPrices.add(price);
    }

    public void setCategory(String category) {
        this.category = category;
    }

    Amazon(String name, int inventory, double price, String category){
       setProductName(name);
       setInventory(inventory);
       setPrice(price);
       setCategory(category);
    }

    Amazon(){};


    @Override
    public String toString() {
        return "Name: "+getProductName().toUpperCase() +
                "\nInventory: "+getInventory() +
                "\nPrice: $" +getPrice()+
                "\nCategory: "+getCategory().toUpperCase() ;
    }

    static void printAllProducts(){

        Enumeration enumeration=productNames.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }

    static void printPriceOfProduct(String name){
        System.out.println(productPrices.get(productNames.indexOf(name)));
    }


    static void purchase(String name,ArrayList<Amazon> products){

        if (productNames.contains(name)){
            int amount = productInventory.get(productNames.indexOf(name));//5
            if (amount>0){
                productInventory.set(productNames.indexOf(name),--amount);//4
                for (Amazon item:products) {
                    if (item.getProductName().equals(name)){
                        item.setInventory(amount);
                    }
                }
                System.out.println("Available amount after purchase is " + productInventory.get(productNames.indexOf(name)));
            }else {
                System.out.println(name+ " is out of stock.");
            }
        }else {
            System.out.println(name+" is not in product list.");
        }

    }


    static void printDetail(String productName, ArrayList<Amazon> products){
        if (productNames.contains(productName)){
            for (Amazon item:products) {
                if (item.getProductName().equals(productName)){
                    System.out.println(item);
                }
            }
        }else {
            System.out.println(productName+" is not in product list.");
        }

    }
}
