package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PracticeLinkedList {
    public static void main(String[] args) {
        List<String> names=new LinkedList<>();
        LinkedList<String> names2=new LinkedList<>();
        names2.add("Hannah");
        names2.add("Robert");
        LinkedList linkedList=new LinkedList<>();
        LinkedList<Integer> numbers=new LinkedList<>();
        LinkedList<Boolean> booleanLinkedList=new LinkedList<Boolean>();
        names.add("Anna");
        names.add("George");
        names.add("Samantha");
        System.out.println(names2);

        names2.addAll(1,names);
        names2.addFirst("Jessica");
        names2.addLast("Morgan");
        System.out.println(names2);

        System.out.println(names2.getFirst());
        System.out.println(names2.getLast());
        names2.add(3,"Joshua");
        names2.add(1,"Joshua");
        System.out.println(names2.indexOf("Anna"));
        System.out.println(names2.lastIndexOf("Joshua"));
        System.out.println(names2);
        System.out.println(names2.contains("Anna"));
        System.out.println(names2.peek());
        System.out.println(names2.peekFirst());
        System.out.println(names2.peekLast());
        System.out.println(names2.pollFirst());
        System.out.println(names2.pollLast());
        System.out.println(names2);
        ArrayList<Integer> nums=new ArrayList<>();
       names2.remove("Hannah");
        System.out.println(names2);
        names2.add("George");
        names2.addFirst("Robert");
        System.out.println(names2);
        names2.removeFirst();
        System.out.println(names2);
        names2.removeFirstOccurrence("George");
        System.out.println(names2);



    }
}
