package switchStatement;

public class SwitchStatementPractice {
    public static void main(String[] args) {
        String c = "Java";
        final String f = "Java";//constant

        String str = f.concat(" java");
        System.out.println(str);
        double r=0.234;
        switch (c) {

            case "Python":
                System.out.println("case 2");
                break;
            case "C#":
                System.out.println("case 3");
                break;
            case f:
                System.out.println("case 1");
                break;
            case "Java Script":
                System.out.println("case 4");
                break;
            case "Ruby":
                System.out.println("case 5");
                break;
            default:
                System.out.println("default case");

        }
    }

}
