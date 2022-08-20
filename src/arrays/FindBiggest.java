package arrays;

public class FindBiggest {
    public static void main(String[] args) {
        int[] arr = {100,1000,2000,5};
        // Find the biggest element from given array
        // Find the smallest element from given array
        int smallestNum=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (smallestNum>arr[i]){
                smallestNum=arr[i];
            }
        }
        System.out.println(smallestNum);


         int biggestNum =arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (biggestNum<arr[i]){
                biggestNum=arr[i];
            }
        }
        System.out.println(biggestNum);




    }
}
