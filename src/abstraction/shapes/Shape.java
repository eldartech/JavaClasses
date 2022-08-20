package abstraction.shapes;

public abstract class Shape {
    String name;
    String color;

    Shape(String name,String color){
        this.name=name;
        this.color=color;
    }



    public abstract Number getArea();

    public abstract void printDetails();
}
