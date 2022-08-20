package inheritance;

public class ItalianCook extends Cook{

    ItalianCook(String name, int age) {
        super(name, age);
    }

    void cookPasta(){
        System.out.println("cooking pasta");
    }
}
