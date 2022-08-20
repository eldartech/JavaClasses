package whileLoop;

public class NumberPractice {
    public static void main(String[] args) {
//        while (){
//           this is a repeating
//
//        }


        int a =4;
        int b = 8;

        while (a<b){
            System.out.println("a is smaller");//1 2 3 4
        a++;//5 6 7 8
        }
        // Since the condition is false, following while loop won't run.
      while (a<b){

          System.out.println("a is smaller");
          a++; b--;
      }

      a=4;
      b=8;
      while (a<b){
          System.out.println("a is smaller again");//1 2
          a++;//5 6
          // a++ or a= a+1;
          b--;//7 6
      }
        System.out.println(b);
        System.out.println(a);




    }
}
