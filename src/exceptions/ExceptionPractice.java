package exceptions;

public class ExceptionPractice {
    public static void main(String[] args) {
        String str ="null";
        int[] arr=new int[5];
        try {
            System.out.println(str.length());
            System.out.println(arr[5]);
        }catch (Throwable e) {
            e.printStackTrace();
        }


    }
}
