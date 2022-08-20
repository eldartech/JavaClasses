package abstraction;

public abstract class Employee {


     void printName() {

         System.out.println("Abby");
     }

     abstract int calcSalary();
     abstract String genID(String name);
}
