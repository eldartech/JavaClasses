package forLoop;

public class NumberPyramid {
    // Ask user to number of rows and print out the pyramid like below.
    // 1
    // 12  //2
    // 123
    // 1234
    // 12345

    public static void main(String[] args) {

        //
        int numberOfRows = 5;
        for (int i = 1; i <=numberOfRows ; i++) {

            // I should print numbers from one to number of line
            // This inner loop determines the line
            for (int num=1;num<=i;num++){
                System.out.print(num);
            }
            System.out.println();
        }





    }


}
