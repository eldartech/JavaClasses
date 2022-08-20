package abstraction.phone;

public interface Memory {
    byte CAPACITY =Byte.MAX_VALUE;
    String speed();

    static void staticPrint(){
        System.out.println("Print from static method in Interface Memory");
    }

    default void defaultPrint(){
        System.out.println("Print from default method in Interface Memory.");
    }
}
