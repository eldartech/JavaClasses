    package setCollection.marketApp;

    import java.util.Iterator;
    import java.util.LinkedHashSet;
    import java.util.LinkedList;
    import java.util.UUID;

    public class Product {
        private String productName;
        private double price;
        private int amount;
        private String serialNumber;

        static LinkedHashSet<String> serailNumber =new LinkedHashSet<>();
        static LinkedList<String> productNames = new LinkedList<>();
        static LinkedList<Double> productPrices = new LinkedList<>();

        public String getProductName(){
            return productName;
        }

        public void setProductName(String productName){
            this.productName=productName;
        }

        public double getPrice() {
            return price;
        }

        public int getAmount() {
            return amount;
        }

        public String getSerialNumber() {
            return serialNumber;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }




        Product(String productName,double price,int amount){
           setProductName(productName);
           setAmount(amount);
           setPrice(price);
            this.serialNumber=generateSerialNumber();
            Product.serailNumber.add(serialNumber);
            Product.productNames.add(productName);
            Product.productPrices.add(price);

        }

        private static String generateSerialNumber(){
            return UUID.randomUUID().toString().substring(0,25);
        }

        public String toString(){
            return "Product name: " +getProductName()+
                    "\nProduct price: $" +getPrice()+
                    "\nProduct amount: " +getAmount()+
                    "\nProduct serial number: "+getSerialNumber();
        }

        public static void printProductNames(){
            Iterator iterator=productNames.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }

        public static void printProductPrices(){
            for (Double price:productPrices) {
                System.out.println(price);
            }
        }


        /*


         toString method{

        Product name: name
        Product price: $0.0
        Product amount: amount
        Product serial number: serialNumber
          }

          generateSerialNumber(){
          25characters long
          }

         */
    }
