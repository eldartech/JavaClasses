package recapSession;

public class ComparisonRecap {

    public static void main(String[] args) {
        String s1 = "t";
        String s2 = "l";

        System.out.println(!s1.equals(s2));// true, since the values are different.
        s2.replace("l","t");
        System.out.println(s1.equals(s2)); //
// String is immutable
        // Without reassigning it won't change its value.





    }
}
