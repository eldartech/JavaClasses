package whileLoop;

public class WhileLoopPractice {
    public static void main(String[] args) {
        int x = 0;
        int y = 10;
        int sum = 0;

        System.out.println("Before While Loop.");
        while (x<=y){
            sum+=x;
            //sum=sum+x;
            //
            ++x;
        }
        System.out.println("Sum is equal to "+sum);
        System.out.println("After While Loop.");
    }
}
