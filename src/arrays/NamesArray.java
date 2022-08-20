package arrays;




import java.util.Arrays;
import java.util.Scanner;

public class NamesArray {
    //Ask user how many names they want to store.
    //Get those names from user and store in an array.
    // If the name length is shorter than 4 store in shortNames array.
    // Otherwise store in a longNames array.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many names do you want to store?");
        int length = s.nextInt();
        String [] shortNames= new String[length];
        String [] longNames = new String[length];
        // How many times should I get name from user?
        // length times
        int b =0,c=1,d=2;
//        int c = 1;
//        int d = 2;

        for (int i = 0,indexShort=0,indexLong=0; i <length ; i++) {

            System.out.println("Please enter a name.");
            String name = s.next();
            if (name.length()<4){
                shortNames[indexShort++]=name;
            }else{
                longNames[indexLong++]= name;
            }
        }
        System.out.println(Arrays.toString(shortNames));
        System.out.println(Arrays.toString(longNames));
    }
}
