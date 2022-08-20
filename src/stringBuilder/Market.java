package stringBuilder;

public class Market {
    static String[] items ={"T-shirt","Gum","Necklace","Coffee Mug","Clock","Framed Print","Mirror","Key Chain","Hand Watch","Torch"};
    static double[] prices= {10.99,2.33,25.99,4.79,3.23,2.34,6.34,7.56,8.6,4.56};
    static int[] inventories = {1,2,3,4,5,6,7,8,9,10};

    static StringBuilder getAllDetails(){
        StringBuilder result = new StringBuilder();

        for (int i=0;i<items.length;i++){
            result.append(items[i]+" - $"+prices[i]+" - "+inventories[i]+"\n");
        }
        return result;
    }

    static String getIndex(double price){
        String result="";
        for (int i=0; i<prices.length;i++){
            if (prices[i]==price){
                result+=items[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println( getAllDetails());
        System.out.println(getIndex(4.56));
    }
}
