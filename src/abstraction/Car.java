package abstraction;

public class Car extends Vehicle{
    String make;

    Engine engine=new Engine();

    void print(){
        System.out.println(this.make);
    }

    public void printModel(){
        System.out.println("Method from child");
    }

}
