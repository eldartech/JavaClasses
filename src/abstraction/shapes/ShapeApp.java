package abstraction.shapes;

public class ShapeApp {
    public static void main(String[] args) {
        Triangle triangle=new Triangle("Triangle","red",5,10);
        triangle.printDetails();
        System.out.printf("Color of %s is %s%n",triangle.name,triangle.color);
        System.out.println("Area of "+triangle.name+" is "+triangle.getArea());


        Circle circle = new Circle("Circle", "Blue",15);
        circle.printDetails();
        System.out.println("Color of "+circle.name+" is "+circle.color);
        System.out.println("Area of "+circle.name+" is "+circle.getArea());

        Square square=new Square("purple",7);
        square.printDetails();
        System.out.println(square.getArea());
        System.out.println(square.color);

    }
}
