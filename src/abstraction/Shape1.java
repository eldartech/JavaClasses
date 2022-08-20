package abstraction;

public class Shape1 implements MathShape, Shape{
    @Override
    public Integer getArea() {
        return 100;
    }

    @Override
    public void printShape() {
        System.out.println("Shape1");
    }
}
