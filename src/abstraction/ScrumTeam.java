package abstraction;

import java.util.UUID;

public class ScrumTeam extends Employee implements MathShape,Shape{

    @Override
    int calcSalary(){
        return 100000;
    }

    @Override
    String genID(String name) {
        UUID uuid=UUID.randomUUID();
        return name+uuid;
    }

    @Override
    public Integer getArea() {
        return null;
    }

    @Override
    public void printShape() {

    }
}
