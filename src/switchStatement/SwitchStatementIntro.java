package switchStatement;

public class SwitchStatementIntro {
    public static void main(String[] args) {
        int x =10;
        char letter = 'A';
        switch (letter){

            case 'a':
                System.out.println("Case 1");
            case '3':
                System.out.println("Case 2");
            case '@':

            case 'e':
                System.out.println(letter);

            case 'd':
                System.out.println("Case 3");

            case '6':
                System.out.println("Case 5");
            default:
                System.out.println("this is default case");

        }
    }
}
