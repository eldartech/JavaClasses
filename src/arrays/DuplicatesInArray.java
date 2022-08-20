package arrays;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] numbers = {5,4,5,6,7,8,9,1,2,2,3,8};
        // We need to find duplicate elements and print them out.
        Outer:for (int i = 0; i <numbers.length ; i++) {
          // We need to check every element that comes
            // after numbers[i] to find duplicate
          Inner:  for (int j = i+1; j <numbers.length ; j++) {
                if(numbers[i]==numbers[j]){
                    System.out.println(numbers[j]);
                   continue Outer;
                }
            }
        }






    }
}
