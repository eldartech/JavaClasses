package utilityMethods;

import java.util.Arrays;

public class ArrayMethods {
    /*{1,2,3,4,5,6,7}
    method which will print every element of Array in new line
     */
    private ArrayMethods(){};

    /**
     * printArray accepts int[] and prints out elements of array
     * @param arr
     */
    public static void printArray(int[] arr){
        for (int item:arr){
            System.out.println(item);
        }
    }

    /**
     * printArray accepts String[] and prints out elements of array
     * @param arr
     */
    public static void printArray(String[] arr){
        for (String item:arr){
            System.out.println(item);
        }
    }

    /**
     * print_2D_Array accepts int[][] and prints out elements of array
     * @param arr
     */
    public static void print_2D_Array(int[][] arr){
        for (int[] outer: arr){
            for (int item: outer){
                System.out.println(item);
            }
        }
    }

    /**
     * print_2D_Array accepts String[][] and prints out elements of array
     * @param arr
     */
    public static void print_2D_Array(String[][] arr){
       for (int i=0;i<arr.length;i++){
           for (int j=0;j<arr[i].length;j++){
               System.out.println(arr[i][j]);
           }
       }
    }

    /*
    method to reverse an array
    {"Miami","Chicago","Houston","Seattle","New York"}
    output:
    {"New York","Seattle","Houston","Chicago","Miami"}
     */

    /**
     * reverseArray accepts String[] and returns reversed String[]
     * @param arr
     * @return
     */
    public static String[] reverseArray(String[] arr){
        String[] reversedArr=new String[arr.length];
        for (int i=0,j= arr.length-1;i< reversedArr.length;i++,j--){
            reversedArr[i]=arr[j];
        }
        return reversedArr;
    }

    /**
     * reverseArray accepts int[] and returns reversed String[]
     * @param arr
     * @return
     */
    public static int[] reverseArray(int[] arr){
        for (int left=0, right=arr.length-1;left<right;left++,right--){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
        return arr;
    }

    /**
     * reverseArray accepts char[] and reverses the char[]
     * @param arr
     */
    public static void reverseArray(char[] arr){
        for (int left=0, right=arr.length-1;left<right;left++,right--){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
    }

    /**
     * averageOfNumbers accepts int[] and returns average of array elements
     * @param arr
     * @return double
     */
    public static double averageOfNumbers(int[] arr){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double result=sum/arr.length;
        return result;
    }

    /**
     * arrayContains accepts int[], int and returns true/false, if element is within the array
     * @param arr
     * @param num
     * @return
     */
    public static boolean arrayContains(int[] arr,int num){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==num){
                return true;
            }
        }
        return false;
    }

    /**
     * arrayContains accepts char[], char.
     * Method checks if value exists in provided array.
     * @param arr
     * @param element
     * @return
     */
    public static boolean arrayContains(char[] arr,char element){
        Arrays.sort(arr);
       int index =  Arrays.binarySearch(arr,element);
        if (index>=0)
            return true;
        return false;
    }

    /**
     * arrayContains checks if String[] contains String
     * @param arr
     * @param element
     * @return
     */
    public static boolean arrayContains(String[] arr, String element){
        String str = "";
        for (int i = 0; i<arr.length;i++){
            str+=arr[i];
        }
        if (str.contains(element)) {
            return true;
        }
        return false;

    }







}
