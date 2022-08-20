package methods.objects;

public class Class1 {
    public String name;
    int result=900;
     public static int average;

    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.print();
        class1.print("Hello form main method");
        System.out.println(class1.sum(1000));
        System.out.println(average);
        average=9000;
        printStatic();

    }
    void print(){
        System.out.println("Hello from class 1");
        result=50;
        System.out.println(result);
        name="Eddie";
        print("Hello");
        average=1000;
        printStatic();
        result=10000;
        average=200;
        printStatic();


    }
    void print(String word){
        System.out.println(word);
    }

    static void printStatic(){
        System.out.println("static method from class 1");
        average=9000;
        main(new String[10]);
        Class1 className=new Class1();
        className.result=4329;
        className.name="Ada";


    }


      int sum(int num){
        int r = num;
        result+=r;
        return result;
    }
}
