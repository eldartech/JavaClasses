package abstraction;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.printModel();
        Vehicle vehicle1=new Car();
        vehicle1.printModel();
        Car car=new Car();
        car.printModel();
    }
}
