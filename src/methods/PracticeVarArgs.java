package methods;

public class PracticeVarArgs {
    public static void walk(int num, int... nums){
        System.out.println(nums.length);
    }

    public static void main(String... args) {


        walk(100,1,2,3,3,34);
    //    walk(1,20,12,66);
    }
}
