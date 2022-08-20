package arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] numArray1 = {1,1,1,1,1,1,1,1};
        int[] numArray2 = {1,1,2};
        System.out.println(Arrays.toString(duplicates(numArray1,numArray2)));
        Test test = new Test();
        test.smth(numArray1);

    }
    public static int[] duplicates(int[] arr1, int[] arr2){
        int count=0;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                   count++;
                    break;
                }
            }
        }
        int[] result=new int[count];
        if (result.length==0){
            return null;
        }else {
            for(int i = 0,l=0; i < arr1.length; i++){
                for(int j = 0; j < arr2.length; j++){
                    if(arr1[i] == arr2[j]){
                        result[l++]=arr1[i];
                        break;
                    }
                }
            }
            return result;
        }
    }
    public void smth(int... args){
        removeduplicates(new int[]{1,2,3,4},4);
        System.out.println(Arrays.toString(args));

    }
    private  int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }

        return j;
    }
    public static void run(int... nums) {
        System.out.println(nums[1]);
    }
}
