package forLoop;

public class NestedLoop1 {
    public static void main(String[] args) {
        // Use for loop.
        // sout -> print short cut
        // main or psvm -> main method short cut
     // Print every hour in a day
        // print minutes with hours
        // print seconds as well
        // 1:0:0
        // 1:0:1
        // ..
        // 1:59:0
        // 2:0
        // ..
        // 2:59
        // 3:0
        // ..
        //24
        // Can we access variables from outside the scope?
        // We cannot access variables from outside the scope.
        // Putting labels for loops
        HOUR:for (int h = 0; h <24 ; h++) {

          MINUTE: for (int m=0; m<=59;m++){
               SECOND:for (int s = 0; s <=59 ; s++) {
                   System.out.println(h+":"+m+":"+s);



               }

           }

        }

    }
}
