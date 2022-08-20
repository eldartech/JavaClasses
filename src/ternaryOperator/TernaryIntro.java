package ternaryOperator;

public class TernaryIntro {
    public static void main(String[] args) {
        System.out.println("10<6".equals("10<6") ? 40 : "HELLO WORLD");
        if ("10<6".equals("10<6")){
            System.out.println(40);
        }else {
            System.out.println("HELLO WORLD");
        }
        int a = 10<6 ? 40 : 100;
        System.out.println(a);

        int x =1;
        int y =1;
        int z = x==y      ?       2       :        3;
        System.out.println(z);
        boolean isEqual = "Hello".equals("Hello")?  true: false;
        System.out.println(isEqual);
        String str1 = x==y   ? "Java":"Python";
        System.out.println(str1);


        System.out.println(x==y   ? '1' :"2");
        System.out.println("===================");


        int t = 5;
        int w;
        if(t > 5) {
            w = 2 * t;
        } else {
            w = 3 * t;
        }
        System.out.println(w);

        int r = (t > 5 ) ?  (2 * t)   :   (3 * t);
        System.out.println(r);

        int c = r!=w? t++:t--;
        System.out.println(c);
        System.out.println(t);
        System.out.println(r!=w? "Hello":--t);
        System.out.println("===================");
        String str2="java";

//t=3
        t=6;
        int u = (t > 5)  ? (str2.equalsIgnoreCase(str1)? (2 * t) : (10*t))  :   (3 * t);
        System.out.println(u);

    }
}
