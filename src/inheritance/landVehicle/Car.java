package inheritance.landVehicle;

public class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }

    @Override
    protected Integer accelerate() {
        System.out.println("Car is accelerating");
        return 100;
    }
}
