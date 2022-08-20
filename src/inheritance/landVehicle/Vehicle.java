package inheritance.landVehicle;

public class Vehicle {
    protected String make;
    int year;

     void drive(){
        System.out.println("Vehicle is driving.");
    }

    public void stop(){
        System.out.println("Vehicle is stopping.");
    }

    protected Number accelerate(){
        System.out.println("Vehicle is accelerating");
        return 20;
    }
}
