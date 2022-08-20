package inheritance.hierarchical;

public class Child2 extends Parent{

    Child2(String name) {
        super(name);
    }

    void methodFromChild2(){
        System.out.println("method from child 2");
    }
}
