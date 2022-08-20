package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWarmUp {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList();
        nums.add(100);
        nums.add(50);
        nums.add(1);
        nums.add(44);
//        System.out.println(nums);
    //    int [] numsArr={1,2,3,4,5,6,7,9};
//        System.out.println(Arrays.toString(numsArr));
//        System.out.println("Length of array: "+numsArr.length);//array length
//        System.out.println("Size of ArrayList: "+nums.size());//array list size
        nums.add(100);
        nums.add(1000);
//        System.out.println(nums);
//        System.out.println("Size of ArrayList: "+nums.size());
        List/*<Object>*/ list=new ArrayList(2);
//        System.out.println(list.size());
//        System.out.println(list);
        list.add("Java");
        list.add(23);
//        System.out.println(list.size());
//        System.out.println(list);
        list.add(true);
//        System.out.println(list);
//        System.out.println(list.size());

        ArrayList copyOfList=new ArrayList(list);
        System.out.println(copyOfList);

        ArrayList<Boolean> conditions = new ArrayList<Boolean>();
        conditions.add(true);
        conditions.add(isEqual());
        conditions.add(40>10);
        conditions.add(copyOfList.equals(list));
        conditions.add(copyOfList==list);
        System.out.println(conditions);
        copyOfList.add(0,"Python");
        System.out.println(copyOfList.get(3));
        int [] numsArr={1,2,3,4,5,6,7,9};
        System.out.println(numsArr[0]);







    }

    static  boolean isEqual(){
        return 100==100;
    }
}
