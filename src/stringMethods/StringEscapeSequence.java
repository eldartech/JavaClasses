package stringMethods;

public class StringEscapeSequence {
    public static void main(String[] args) {
        //"Hello World!"

        System.out.println("\"\tHello\n World!\"");
        System.out.println("c:\\users\\nameUser\\Desktop\\folder");
        System.out.println("\\Users\\techtorialacademy");
        System.out.println("\'Hello World\'");

        String str = "I love Java";
        System.out.println("\""+str+"\"");

        System.out.println("\"Example of Unicode Character Sequence\", \u00A9 2022 Techtorial");
    }
}
