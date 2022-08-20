package abstraction.shapes;

public class Triangle extends Shape{
    int base;
    int height;

    Triangle(String name,String color, int base, int height){
        super(name,color);
        this.base=base;
        this.height=height;
    }

    @Override
    public Integer getArea() {
        return base*height/2;
    }

    @Override
    public void printDetails() {
        System.out.println("Base="+base+"\nHeight="+height);
    }
}
