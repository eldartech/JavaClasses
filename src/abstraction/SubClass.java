package abstraction;

public class SubClass extends SuperClass{
    @Override
    public void printMethod(){
        System.out.println("Print message");
    }
}

/*
    1. abstract Shape class
    String name
    String color
    1 or 2 abstract methods  countArea()
    Sub classes:
    Triangle
        base
        height
        A=height*base/2
    Square
        side A=side*side;
    Circle
        radius
        A=radius*radius*3.14

 */
