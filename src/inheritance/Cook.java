package inheritance;

public class Cook {
    String name;
    int age;

    Cook(String name, int age){
        this.name=name;
        this.age=age;
    }

    void cookFood(){
        System.out.println("Cooking decent food.");

    }

    void makeSalad(){
        System.out.println("Making ordinary salad.");
    }

    Number cookingTime(){
        return 2;
    }
}
