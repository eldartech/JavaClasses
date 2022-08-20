package recapSession;

public class PrePostIncrement {
    public static void main(String[] args) {
        int i =6;
        System.out.println(i++ + i);//13
        System.out.println(++i + i +i++ +i+ i++);// 42
        //                   8    8  8    9  9
        System.out.println(i);//10

    }
}
