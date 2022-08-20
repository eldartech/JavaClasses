package abstraction.phone;

public class Phone implements FaceRecognition,MemoryCard{
    String model;
    double price;
    @Override
    public void scanFace() {
        System.out.println("face scanned");
    }

    @Override
    public String speed() {
        System.out.println("Speed of phone is");
        return "65kb";
    }

    public void call(){
        System.out.println("Dialing");
    }

    public void text(String text){
        System.out.println("\""+text+"\""+" delivered");
    }

    public void playMusic(){
        System.out.println("Playing music");
    }
}
