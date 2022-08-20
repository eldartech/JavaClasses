package forLoop;

public class ForPractice {


    public static void main(String[] args) {

        String str = "abcghjkhgf";
        // Print all the letters one by one
      //str.charAt(0); -> It is the first letter from the string

     //   System.out.println(str.charAt());

// what should become dynamic in this print statement?
        // index should be dynamic
        //Where does the dynamic element(index) start?
        // 0
        // Where does the dynamic element(index) end?
        // str.length()-1
        for (int i=0;i<str.length();i++){

            System.out.println(str.charAt(i));
        }
//        str = "abc";
//        for (int i=0;i<str.length(); System.out.println(str.charAt(i))){
//         i++;
//
//        }





    }
}
