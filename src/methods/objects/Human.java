package methods.objects;

public class Human {
    String name;
    int height;
    int weight;
    static String race;
    char gender;
    int age;

    void run(){
        System.out.println(name+" running");

    }

    public int run(int speed,short time){
        System.out.println(speed);
        int distance=1000;
        return distance;
    }

    public static void run(short time, int speed){
        System.out.println(time*speed);
    }

    protected boolean run(boolean isRunning){
        System.out.println("Is running");
        return isRunning;
    }
    static void talk(String words){
        Human human=new Human();
        human.race="Asian";
        race ="Hispanic";
        System.out.println(human.name+" says:\n"+words);
    }



}
