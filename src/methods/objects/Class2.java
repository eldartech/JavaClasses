package methods.objects;

public class Class2 {
    public static void main(String[] args) {
        // Class variables and methods (static method/static variable)
      Class1.average=1000;// class variable is called using class name
      Class1 nameOfClass=new Class1();
        nameOfClass.average=2000; //class variable is called using reference of object

      Class1.printStatic();//class method(static method) is called using class name
        nameOfClass.printStatic();//class method(static method) called using reference of object

        // instance variables and instance methods

        nameOfClass.name="Anna";//instance variable called using reference of object
        nameOfClass.sum(123);//instance method called using reference of object








    }
}
