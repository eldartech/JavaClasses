package setCollection.hashSet;

import java.util.*;

public class HashSetLesson1 {
    public static void main(String[] args) {
        Set noTypeSet = new HashSet();//no data specified declaration of Set
        //add() to add value,true if this set did not already contain the specified element

        noTypeSet.add("value 1");
        noTypeSet.add("value 2");
        System.out.println(noTypeSet);

        //specification of data type and copying of list
        Integer [] idArr={123,354,254};
        Set<Integer> ids=new HashSet<>(Arrays.asList(idArr));
        System.out.println(ids);

        //specification of capacity of set
        HashSet<String> colors = new HashSet<>(20);
        ArrayList<String> colorList=new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("White");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Green");
        colorList.add("Black");
        colorList.add("Yellow");
        colorList.add("Maroon");
        colorList.add("Purple");
        colorList.add("Pink");
        System.out.println("Print out of Array List: "+colorList);
        colors.addAll(colorList);
        System.out.println("Print out of Set: "+colors);
        System.out.println("Iterator Print Out:");
        //traverse(iterate) the set elements using iterator

//        Iterator<String> colorIterator=colors.iterator();
//        while (colorIterator.hasNext()){
//            System.out.println("Color is "+colorIterator.next());
//        }
        System.out.println("For Each Loop Print Out:");
        for (String color:colors) {
            System.out.println(color);
        }
        //size() gives us the amount of elements in set
        System.out.println("Size of set is "+colors.size());
        /*Task
        create Set with colors stored
        print out only colors starting with 'B' letter
         */
        System.out.println("Colors starting with letter P:");
       /* for (String color:colors) {
            if (color.startsWith("P")){
                System.out.println(color);
            }
        }*/
        printSet("P",colors);
        System.out.println("Before removal: "+colors);
//        Iterator<String> colorIterator=colors.iterator();
//        while (colorIterator.hasNext()){
//            if (colorIterator.next().equals("Pink")){
//                colorIterator.remove();
//            }
//        }
        removeSetValue("Green",colors);
        System.out.println("After removal: "+colors);

    }

    //create method to print values of set depending on the provided value

    static void printSet(String name, HashSet<String> values){
        for (String item:values) {
            if (item.startsWith(name)){
                System.out.println(item);
            }
        }
    }
    //create a method to remove value from provided set
    //Set<Integer> {12,3,4,5,6,}

    static  void removeSetValue(String value,HashSet<String> values){
//        Iterator iterator= values.iterator();
//        while (iterator.hasNext()){
//            if (iterator.next().equals(value)){
//                iterator.remove();
//            }
//        }
        values.remove(value);
    }

}
