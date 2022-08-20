package abstraction.phone;

public class PhoneApp {
    public static void main(String[] args) {
        Iphone iphone=new Iphone();
        iphone.model="Apple i-Phone XIII";
        iphone.price=700;
        iphone.applePay();
        iphone.playMusic();
        iphone.defaultPrint();
        Memory.staticPrint();
        iphone.scanFace();
        iphone.text("Hi Everyone, glad to join your group.");
        iphone.call();
        System.out.println(iphone.speed());;
    }
}
