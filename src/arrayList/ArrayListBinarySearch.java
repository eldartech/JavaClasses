package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListBinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(100);
        numbers.add(10);
        numbers.add(123);
        numbers.add(50);
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println(Collections.binarySearch(numbers,40));
        Iterator<Integer> iterator=numbers.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        for (;iterator.hasNext();){
            System.out.print(iterator.next()+" ");
        }
    }
}
