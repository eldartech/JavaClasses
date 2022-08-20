package inheritance.hierarchical;

import java.util.LinkedList;
import java.util.List;

public class TestHierarchicalClasses {
    public static void main(String[] args) {
        Child1 child1 = new Child1("Jonathan");
       child1.id=101;


       child1.schoolName="Techtorial";
       child1.methodParent();
        System.out.println(child1.id);
        System.out.println(child1.name);
        System.out.println(child1.schoolName);


        Child2 child2=new Child2("Alice");
        child2.id=102;
//        child2.name="Alice";
        child2.methodParent();
        System.out.println(child2.id);
        System.out.println(child2.name);
        child2.methodFromChild2();

        Child3 child3=new Child3("Robert");
        child3.id=103;
//        child3.name="Robert";
        child3.methodParent();
        System.out.println(child3.id);
        System.out.println(child3.name);
        child3.methodFromChild3();


    }
}
