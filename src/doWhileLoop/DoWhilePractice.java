package doWhileLoop;

public class DoWhilePractice {
    public static void main(String[] args) {
        String name = "Jessica";
        int index = 0;
        int length = name.length();
        System.out.println("before loop");
        do {
            System.out.println(name.charAt(index++));//6
        }while (index<length);//7<7
        System.out.println("after loop");
    }
}
