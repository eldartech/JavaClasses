package methods;

public class PracticeMethod2 {

    static void printWord(){
        for (int i=0;i<10;i++){
            System.out.println("Hi from method");
        }
    }

    static void printLetters(String word){
        for (int i=0;i<word.length();i++){
            System.out.println(word.charAt(i));
        }
    }

    int printLength(String word){
        printLetters(word);
        return word.length();

    }

    public static void main(String[] args) {
        printWord();
        PracticeMethod2 obj = new PracticeMethod2();
        System.out.println(obj.printLength("World"));
    }

}
