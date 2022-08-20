package setCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPractice2 {
    public static void main(String[] args) {
        String word="techtorial";
        ArrayList<Character> unique=getUnique(word);
        System.out.println(unique);
        System.out.println(getUnique(word));
        System.out.println(getUnique1(word));
        System.out.println(getUniques(word));
        int[] nums={45,234,12,3,3,4,4,Integer.MAX_VALUE,5,5,Integer.MIN_VALUE,5,234567812,12,32,43};
        TreeSet<Integer> evenNums=getUniqueSortedNumbers(nums);
        System.out.println(evenNums);
        System.out.println(getUniqueSortedNumbers(nums));
        System.out.println(getUniqueOddNumbers(nums));

    }
        /*
        method which will give us the unique letters of string
        accept word(String)
        return list of characters
        ex:
        uniqueLetter("techtorial")
        out:
        list of t,e,c,h,o,r,i,a,l
         */
    public static ArrayList<Character> getUnique(String word){
        ArrayList<Character> result = new ArrayList<>();
        LinkedHashSet<Character> uniques=new LinkedHashSet<>();
       for (int i=0; i<word.length();i++){
           uniques.add(word.charAt(i));
       }
        result.addAll(uniques);
        return result;
    }

    public static ArrayList<String> getUniques(String word){
        return new ArrayList<String>(new LinkedHashSet<>(Arrays.asList(word.split(""))));
    }

    public static ArrayList<Character> getUnique1(String word){
        LinkedHashSet<Character> uniques=new LinkedHashSet<>();
        for (int i=0; i<word.length();i++){
            uniques.add(word.charAt(i));
        }
        return new ArrayList<>(uniques);
    }

    /*
    create a method which will accept array of numbers
    return sorted set  of unique even numbers

     */
     protected static TreeSet<Integer> getUniqueSortedNumbers(int[] nums){
         TreeSet<Integer> result = new TreeSet<>();
         for (int i=0; i<nums.length;i++){
             if (nums[i]%2==0){
                 result.add(nums[i]);
             }
         }
         return result;
     }

    /*
    create a method which will accept list of numbers
    return set of unique odd numbers in descending order
     */
    protected static TreeSet<Integer> getUniqueOddNumbers(int[] nums){
        TreeSet<Integer> result = new TreeSet<>();
        for (int i=0; i<nums.length;i++){
            if (nums[i]%2==1){
                result.add(nums[i]);
            }
        }
        return (TreeSet<Integer>) result.descendingSet();
    }


}
