package constructor.cicleApp;

public class Circle {
    private double radius;
    private String color;
    static final double PI = 3.14;

    {
        radius = 1.0;
        color = "black";
    }
    Circle() {}

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color) {
        this(radius);
        this.color = color;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double number) {
        radius = number;
    }

    String getColor() {
        return color;
    }

    void setColor(String value) {
        color = value;
    }

    double getArea() {
        return radius * radius * PI;
    }

    double getDiameter() {
        return radius * 2;
    }

    double getPerimeter() {
        return 2 * PI * radius;
    }

    void printDetails(){
        System.out.println("Color: "+color.toUpperCase()+"\nRadius: "+ radius
                +"\nDiameter: "+getDiameter()+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter());
    }

    public String toString(){
        return "Color: "+color.toUpperCase()+"\nRadius: "+ radius
                +"\nDiameter: "+getDiameter()+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter();
    }

}
