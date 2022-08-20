package abstraction;

import java.util.Random;

public class Dev extends Employee{
    @Override
    int calcSalary() {
        return 150000;
    }

    @Override
    String genID(String name) {
        Random random=new Random();

        return name+random.nextInt(10000);
    }

    @Override
    void printName(){
        System.out.println(new Random().nextInt(100));
    }
}
