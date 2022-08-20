package arrays;

public class MultiDimensionExample {

    public static void main(String[] args) {
        String[][] brands={{"Apple","Dell","HP","Lenovo","Acer"},
                {"Samsung","LG","Sony"},
                {"Alexa","Google","Siri","Logitech","JBL"}
        };
        double[][] prices={{2500,1900,1800,1100,1600},
                {2199,1699,1599},
                {79.99,89.99,99.99,69.99,59.99}
        };
        for (int i = 0; i < brands.length; i++) {
            for (int j = 0; j <brands[i].length ; j++) {
                System.out.println("The price for the product "+brands[i][j]+" is "+prices[i][j]);
            }
        }
    }
}
