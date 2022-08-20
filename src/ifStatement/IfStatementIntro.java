package ifStatement;

public class IfStatementIntro {
    public static void main(String[] args) {

     /*
    String Methods with boolean return type:
     startsWith()
     endsWith()
     equals()
     equalIgnoreCase()
     contains()
Conditional Operators(Unary)
     ==
     !=
     >=
     <=
     <
     >
Logical Operators
     &&  -  and
     true && true => true
     false && false => false
     false && true => false
     true && false => flase
     ||  -  or
     true || true   ==> true
     true || false  =>true
     false || true =>true
     false || false => false
      */
        String str1 = "Hello If Statement";
        boolean isStartsAndEnds = str1.startsWith("hello") && str1.endsWith("t");
        if (isStartsAndEnds) {
            System.out.println(str1.replace("Hello", "Good Bye"));
        }
        System.out.println("=====Out of If Statement 1=====");
       // boolean isStartsOrEnds = str1.startsWith("hell") || str1.endsWith("T");

        if (str1.startsWith("hell") || str1.endsWith("T")) {
            System.out.println("=====Inside of If Statement 2=====");
            str1 = str1.concat(" Control Flow");
        }
        System.out.println("=====Out of If Statement 2=====");
        System.out.println(str1);
    }
}
