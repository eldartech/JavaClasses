package inheritance.airVehicle;

import inheritance.landVehicle.Vehicle;

public class Plane extends Vehicle {


    @Override
    public void stop(){
        System.out.println("Plane is stopping.");
    }
   @Override
    public Float accelerate(){
        System.out.println("Plane is accelerating");
        return 234.23F;
    }
}
