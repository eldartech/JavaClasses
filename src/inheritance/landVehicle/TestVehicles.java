package inheritance.landVehicle;

import inheritance.airVehicle.Plane;
import inheritance.landVehicle.Bus;
import inheritance.landVehicle.Car;
import inheritance.landVehicle.Vehicle;

public class TestVehicles {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        Car car=new Car();
        Bus bus=new Bus();
        car.make="BMW";
        System.out.println(car.make);
        car.drive();
         System.out.println(car.accelerate());
         car.stop();
         bus.make="International";
        System.out.println( bus.make);
         bus.drive();
        System.out.println(bus.accelerate());
         bus.stop();
        Plane plane=new Plane();
        plane.make="Airbus";

        System.out.println(plane.make);
        System.out.println(plane.accelerate());
        plane.stop();



    }
}
