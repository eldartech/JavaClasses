package doWhileLoop;

public class DoWhileLoopIntro {


    public static void main(String[] args) {
        int x=10;
        System.out.println("Before While Loop x is "+x);
        while (x>0){
            System.out.println("Inside of While Loop "+x--);
        }
        System.out.println("After While Loop x is "+x);
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Before Do While Loop x is "+x);
        do {
            System.out.println("Inside of Do While Loop."+x++);
        }while (x<10);
        System.out.println("After Do While Loop x is "+x);
    }
}
