package abstraction.shapes;

public class Square extends Shape{
    int side;

    Square(String color, int side){
        super("Square",color);
        this.side=side;
    }

    @Override
    public Long getArea() {
        return (long)Math.pow(side,2);
    }

    @Override
    public void printDetails() {
        System.out.printf("%s's side is %d%n",super.name,side);
    }
}
