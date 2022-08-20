package abstraction;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee=new ScrumTeam();
        employee.printName();
        System.out.println("Salary is "+employee.calcSalary());
        System.out.println("ID is "+employee.genID("QA"));

        Dev dev=new Dev();
        System.out.println("Dev salary is "+dev.calcSalary());
        System.out.println("Dev ID is "+dev.genID("DEV"));
        Car car=new Car();
        car.engine.star();
        car.engine.stop();
    }
}
