package constructor.bicycleApp;

public class TestBicycle {
    public static void main(String[] args) {
        Bicycle bicycle=new Bicycle("Ural",100,"R1000",2);
        System.out.println(bicycle.make);
        System.out.println(bicycle.model);
        System.out.println(bicycle.price);
        System.out.println(bicycle.amountOfWheels);
        Bicycle bicycle1 = new Bicycle("BMX");
        System.out.println(bicycle1.make);

        Bicycle[] bicycles={bicycle,bicycle1,new Bicycle("BMW",500,"X666",3)};


        for (Bicycle b:bicycles){
            System.out.println(b.make+" "+b.price+" "+b.model+" "+b.amountOfWheels);
        }


    }
}
