package setCollection.linkedHashSet;

import java.util.*;

public class LinkedHashSetLesson1 {
    public static void main(String[] args) {
        //LinkedHashSet maintains insertion order
        Set linkedHashSet=new LinkedHashSet();
        LinkedHashSet<Integer> nums=new LinkedHashSet<>();// insertion order
        nums.add(100);
        nums.add(90);
        nums.add(80);
        nums.add(1);
        HashSet<Integer> numsHash=new HashSet<>(nums);// random order
        System.out.println("HashSet: "+numsHash);
        System.out.println("LinkedHashSet: "+nums);
        LinkedHashSet objects=new LinkedHashSet();
        LinkedHashSet<String> linkedHashSetCopyArray = new LinkedHashSet<>(Arrays.asList(new String[]{"Java","Python"}));
        LinkedHashSet<String> linkedHashSetCopySet = new LinkedHashSet<>(linkedHashSetCopyArray);
        System.out.println(linkedHashSetCopySet);
        nums.remove(100);
        System.out.println("After removing 100: "+nums);
        if (linkedHashSet.isEmpty()){
            linkedHashSet.addAll(Arrays.asList("Anna","David","Patel","Dmitrius"));
        }else {
            linkedHashSet.add(null);
        }
        System.out.println(linkedHashSet);

        Iterator iterator=linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Object[] objArr=linkedHashSet.toArray();
        System.out.println("Printing array of objects:");
        System.out.println(Arrays.toString(objArr));
        Integer[] numbers={98,7,6,54,122,334,5,67,8,9,7};
        System.out.println(Arrays.toString(numbers)+" is unique "+isUnique(numbers));

        if (isUnique(numbers)){
            System.out.println(Arrays.toString(numbers)+" is unique");
        }else {
            System.out.println(Arrays.toString(numbers)+" is not unique");
        }
    }
    static boolean isUnique(Integer[] numbers){
        LinkedHashSet<Integer> numbersSet=new LinkedHashSet<>(Arrays.asList(numbers));
        if (numbers.length == numbersSet.size()){
            return true;
        }
        return false;
    }
     /*Task:
        create one method, which takes Integer array, and if this array has duplicate values, you should
        return false, else it should return true

         */
}
