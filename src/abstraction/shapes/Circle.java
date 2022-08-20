package abstraction.shapes;

public class Circle extends Shape{
    double radius;

    Circle(String name, String color, double radius){
        super(name,color);
        this.radius=radius;
    }

    @Override
    public Double getArea() {
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public void printDetails() {
        System.out.println("Radius is "+radius);
    }
}
