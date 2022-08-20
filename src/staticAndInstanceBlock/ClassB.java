package staticAndInstanceBlock;

public class ClassB {
    public static void main(String[] args) {
        ClassA class1=new ClassA("Toyota",123);
        System.out.println(class1.cityName);
        class1.cityName="Boston";
        System.out.println(ClassA.cityName);
        ClassA class2 = new ClassA("BMW",423);
        System.out.println(class2.cityName);




    }
}
