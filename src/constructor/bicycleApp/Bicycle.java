package constructor.bicycleApp;

public class Bicycle {
    String  model;
    String make;
    int amountOfWheels;
    int price;

    Bicycle(){
    //    System.out.println("No Argument Constructor");
    }


    Bicycle(String make){
        this();
        this.make=make;
   //     System.out.println("1 Argument Constructor");
    }


     Bicycle(String make,int priceOfBicycle){
         this(make);
       price=priceOfBicycle;
    //     System.out.println("2 argument constructor");


    }
    Bicycle(String make,int priceOfBicycle,String model){
        this(make,priceOfBicycle);
        this.model=model;
   //     System.out.println("3 argument constructor");


    }

    Bicycle(String make,int priceOfBicycle, String model, int amountOfWheels){
        this(make,priceOfBicycle,model);
        this.amountOfWheels=amountOfWheels;
     //   System.out.println("4 argument constructor");


    }


    void printPrice(){
        System.out.println(price);
    }



}
