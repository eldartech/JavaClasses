package abstraction;

public interface Shape extends MathShape{
    public static final String NAME = "Triangle";
    int SIDE_A = 10;

    Integer getArea();

    public abstract void printShape();
}
