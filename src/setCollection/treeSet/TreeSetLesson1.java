package setCollection.treeSet;

import java.util.*;

public class TreeSetLesson1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Set<Integer> treeSet2 = new TreeSet<>(treeSet);
        SortedSet<Integer> treeSet3 = new TreeSet<>(Arrays.asList(23,432,12,54,23,123));
        treeSet.add(1000);
        treeSet.add(100);
        treeSet.add(500);
        treeSet.add(999);
        treeSet.add(1);
        System.out.println(treeSet);
        System.out.println(treeSet2);
        System.out.println(treeSet3);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println("Retrieve and remove: "+treeSet.pollFirst());
        System.out.println("After pollFirst: "+treeSet);
        System.out.println("Retrieve and remove: "+treeSet.pollLast());
        System.out.println("After pollLast: "+treeSet);
        /*
        store character from z to a into treeset
        ascending order print out
         */
        TreeSet<Character> letters=new TreeSet<>();
        for (char letter='z';letter>='a';letter--){
            letters.add(letter);
        }
        System.out.println(letters);
        System.out.println(letters.descendingSet());
        System.out.println(letters);
        TreeSet<Character> descLetters = (TreeSet<Character>) letters.descendingSet();
        System.out.println(descLetters);

        Iterator iterator=letters.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        TreeSet<Integer> numbers= new TreeSet<>(Arrays.asList(12,3,4,5,5,5,23,6,8,6,100));
        System.out.println(numbers.ceiling(11));
        System.out.println(numbers.floor(11));
        System.out.println(numbers.higher(12));
        System.out.println(numbers.lower(12));



    }
}
