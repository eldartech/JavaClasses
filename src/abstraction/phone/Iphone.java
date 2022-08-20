package abstraction.phone;

public class Iphone extends Phone{


    void applePay(){
        System.out.println("Apple pay transaction is successful.");
    }

    @Override
    public void playMusic(){
        System.out.println("Playing music out of iTunes");
    }
}
