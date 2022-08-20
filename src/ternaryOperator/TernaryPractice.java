package ternaryOperator;

public class TernaryPractice {

    public static void main(String[] args) {
        int x=10;
        int y =5;
        boolean isEquals= "Hello".startsWith("Hello");



        int result = isEquals ? (x>y?x*y:x/y):  x-y;
        //                      x>y   ?  x*y  : x/y

        System.out.println(result);
        //            booleanExpression     ?  value1 : value2  ;
        System.out.println(isEquals ? 'A' :  false);

        int num1=10;
        int num2=10;
        String str = "Java";
        String str2  = "Python";
        int calc = 'A'==65  ?   ++num1  : str.contains(str2) ? --num1: num1+num2;
        System.out.println(calc);
//        int calc2=0;
//        if ('A'==65){
//            calc2=++num1;
//        }else {
//            if (str.contains(str2)){
//                calc2=--num1;
//            }else {
//                calc2=num1+num2;
//            }
//        }
//        System.out.println(calc2);



    }
}
