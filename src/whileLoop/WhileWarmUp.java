package whileLoop;

public class WhileWarmUp {
    public static void main(String[] args) {
        int x=0;
       String name = "John";
       int length=name.length();
        while (x<length){
            // J 0
            // o 1
            System.out.println(""+name.charAt(x)+" ["+x+"]");
            x++;

        }
    }
}
