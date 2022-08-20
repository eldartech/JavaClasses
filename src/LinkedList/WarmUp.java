package LinkedList;

import java.util.*;

public class WarmUp {
    public static void main(String[] args) {
       LinkedList<String> berries=new LinkedList<>();
       berries.add("strawberry");
       berries.add("blueberry");
        System.out.println(berries);
       berries.addFirst("raspberry");
        System.out.println(berries);
        berries.add(0,"watermelon");
        System.out.println(berries);
        System.out.println(berries.getFirst());
        System.out.println(berries.getLast());
        System.out.println(berries.poll());
        System.out.println(berries);
        berries.remove(1);
        System.out.println(berries);
        berries.add("gooseberry");
        berries.add("cranberry");
        berries.add("cranberry");
        berries.add("blackberry");

        berries.add("gooseberry");
        System.out.println(berries);
        berries.removeLastOccurrence("gooseberry");
        System.out.println(berries);

        Object[] berriesArr=berries.toArray();//list to array Object[]

        System.out.println("Array{"+Arrays.toString(berriesArr)+"}");
        ;//array to list
        System.out.println(Arrays.asList(berriesArr));





    }
}
