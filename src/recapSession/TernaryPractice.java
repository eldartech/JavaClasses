package recapSession;

public class TernaryPractice {
    public static void main(String[] args) {


   //     Find the biggest length of these 2 strings and print.

//        int biggestLength= // it should take the bigger
//             //   value of these two strings
 //       sout(biggestLength);
//
//        int biggestLength=
//
//                condition ? firstValue : SecondValue;
        String str = "akds;jflk";
        String str2 = "sdkj4r";
        int biggestLength=str.length()>str2.length()?str.length():str2.length();
        System.out.println(biggestLength);
    }
}
