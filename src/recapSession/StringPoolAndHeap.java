package recapSession;

public class StringPoolAndHeap {
    public static void main(String[] args) {


    String s1= "tech";
    String s2 = "tech";
    String s3 = "tec"+"h";
    String s4 = new String("tech");
    // Equal method just compare the value of two objects.
        System.out.println(s1.equals(s4));//true
        System.out.println(s1==s4);// false
        System.out.println(s1.equals(s3));// true
        System.out.println(s1==s3);//true
        System.out.println(s1==s2);//true
}}
