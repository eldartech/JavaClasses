package constructor.cicleApp;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1=new Circle();
       //System.out.println(circle1);
        Circle circle2= new Circle(2.2);
     //   System.out.println(circle2);
        Circle circle3 = new Circle(2.4,"red");
        System.out.println(circle3);
        circle3.setRadius(5.5);
        circle3.setColor("blue");
        circle3.printDetails();
    }
}
