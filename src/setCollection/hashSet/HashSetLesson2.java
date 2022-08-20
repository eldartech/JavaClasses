package setCollection.hashSet;

import java.util.*;

public class HashSetLesson2 {
    public static void main(String[] args) {
        //Array to Set conversion, use Arrays.asList()
        String[] colorArr={"Blue","Green","Yellow","Red"};
        List listOfColors = Arrays.asList(colorArr);
        HashSet<String> colorSet=new HashSet<>(Arrays.asList(colorArr));
        HashSet<String> colorSet2=new HashSet<>(listOfColors);
        HashSet<String> colorSet3=new HashSet<>(Arrays.asList("Blue","Green","Yellow","Red"));
        System.out.println(colorSet);
        System.out.println(colorSet2);
        System.out.println(colorSet3);
        //Set to array  toArray()  and toArray(data type array)
        String[] newArray= new String[colorSet.size()];
        colorSet.toArray(newArray);
        System.out.println("Print out of Array:");
        System.out.println(Arrays.toString(newArray));

        Arrays.sort(newArray);
        for (int i = 0; i< newArray.length;i++){
            System.out.println(newArray[i]);
        }
        //using Object[]
        Object[] colorArr2=colorSet.toArray();
        String[] colorArr3=colorSet.toArray(new String[colorSet.size()]);

        //clone() is used to clone/copy set
        HashSet<String> newColorSet=new HashSet<>();
        newColorSet= (HashSet<String>) colorSet.clone();
        System.out.println("Cloned set values: "+newColorSet);

        //HashSet to TreeSet
        Set<String> treeSetColor=new TreeSet<>(colorSet);
        System.out.println("After Converting to Tree Set: "+treeSetColor);

        //HashSet to List(ArrayList,LinkedList,Vector,Stack)
        ArrayList<String> listColors = new ArrayList<>(colorSet);
        System.out.println("ArrayList of colors first element: "+listColors.get(0));
        LinkedList<String> linkedListColors = new LinkedList<>(colorSet);
        System.out.println("LinkedList of colors last element: "+linkedListColors.getLast());
        Vector<String> vectorColors=new Vector<>(colorSet);
        System.out.println("Vector of colors, retrieve element at index 1 "+vectorColors.elementAt(1));



    }
}
