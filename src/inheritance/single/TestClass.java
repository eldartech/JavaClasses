package inheritance.single;

public class TestClass {
    public static void main(String[] args) {
        Subclass subclass=new Subclass();
        subclass.name="Edward";
        subclass.id=1231;
        System.out.println(subclass.name);
        System.out.println(subclass.id);
        subclass.printSalary();
        subclass.isHired=true;
        subclass.working();
    }
}
