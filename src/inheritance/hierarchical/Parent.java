package inheritance.hierarchical;

public class Parent {
    String name;
    int id;

    Parent(String name){
        this.name=name;
    }
    Parent(String name,int id){
        this.name=name;
        this.id=id;
    }

      void methodParent(){
        System.out.println("Method from parent");

    }
}
