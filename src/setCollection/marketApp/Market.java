package setCollection.marketApp;

import java.util.*;

public class Market {
    public static void main(String[] args) {
        Product product=new Product("HP laptop",599.99,4);
        Product product2=new Product("Apple Mac",1599.99,2);
        Product product3=new Product("Lenovo",899.99,4);
        Product product4=new Product("Samsung",799,1);
        Product product5=new Product("Asus",499.99,10);
        Product product6=new Product("Acer",399.99,8);
        System.out.println(product);
        Product.printProductNames();
        Product.printProductPrices();
        ArrayList<Product> products=new ArrayList<>(Arrays.asList(product,product2,product3,product4,product5,product6));
        Product product9=new Product("Nike",799,1);
        Product product7=new Product("Adidas",499.99,10);
        Product product8=new Product("New Balance",399.99,8);
        ArrayList<Product> productList=new ArrayList<>(Arrays.asList(product8,product9,product7));
        printNames(products,800);
        printNamesSerial(products);
        List<ArrayList<Product>> bucket= new ArrayList<>();
        bucket.add(products);
        bucket.add(productList);
        //System.out.println(bucket.get(0));
        System.out.println("---------------");
        System.out.println(bucket.get(1));
        System.out.println("//////////////////////////////////////");
        printProductNamesAmount(products);
        printProductNamesPrice(products);
        System.out.println("****************");
        printProductNamesPrice(bucket.get(0));
        System.out.println("============");
        printProductNamesAmount(bucket.get(1));
        System.out.println("------------------");
        ArrayList<String> result=getNameAmount(products);
        System.out.println(result);
        System.out.println("________________________");
        System.out.println(getNamesPrices(products));
        printNames(productList,400);


    }
    public static void printNames(ArrayList<Product> products, double price){
        for (int i=0;i<products.size();i++){
            if(products.get(i).getPrice()<price){
                System.out.println(products.get(i));
                System.out.println("=========================");
            }
        }
    }

    public static void printNamesSerial(ArrayList<Product>  products){
        for (Product product:products) {
            System.out.println(product.getProductName()+" "+product.getSerialNumber());
        }
    }
    /*
    Product Name price  -> return collection of name + price
    Product Name amount -> return collection of name + amount
    Product Name serial number -> return collection of name + serial number

     */
    static void printProductNamesPrice(ArrayList<Product> products){
        for (Product item:products) {
            System.out.println(item.getProductName()+ " "+ item.getPrice());
        }
    }

    static void printProductNamesAmount(ArrayList<Product> products){
        for (Product item:products) {
            System.out.println(item.getProductName()+ " "+ item.getAmount());
        }
    }

    static ArrayList<String> getNameAmount(ArrayList<Product> products){
        ArrayList<String> namesAmount=new ArrayList<>();
        for (int i =0;i<products.size();i++){
            namesAmount.add(products.get(i).getProductName()+" "+products.get(i).getAmount());
        }
        return  namesAmount;
    }

    static LinkedHashSet<String> getNamesPrices(ArrayList<Product> products){
        LinkedHashSet<String> namesPrices=new LinkedHashSet<>();
        Iterator<Product> name = products.iterator();
        while(name.hasNext()){
            Product product=name.next();
            namesPrices.add(product.getProductName()+" "+product.getPrice());
        }
        return namesPrices;
    }


}
