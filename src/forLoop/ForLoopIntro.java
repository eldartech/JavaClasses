package forLoop;

public class ForLoopIntro {
    public static void main(String[] args) {
        System.out.println("Before for loop.");
    //   1- Initialization     2-booleanExpression      4 - Update Statement
        for (int x=0   ;           x<10                    ;x++){
            //     3 - execution of code
            System.out.println("Inside for loop "+ x);

        }
        System.out.println("After for loop.");
        //techtorial
    /*
    t
    e
    c
    h
    t
    o
    r
    i
    a
    l
     */
        String word = "Techtorial";
        int index = 0;
        System.out.println("While Loop");
        while (index < word.length()){
            System.out.println(word.charAt(index));
            index++;
        }


        System.out.println("======================");
        System.out.println("Do While Loop");
        int c = 0;
        do {
            System.out.println(word.charAt(c));
            c++;
        }while (c<word.length());


        System.out.println("========================");
        System.out.println("For Loop");
        String word2="";
        for (int i=0;i<word.length();i++) {
//            System.out.println(word.charAt(i));
            word2+=" "+word.toUpperCase().charAt(i);
        }
        System.out.println(word2);
            System.out.println("out of for loop");
    }


}
