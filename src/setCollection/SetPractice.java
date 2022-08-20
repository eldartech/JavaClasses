package setCollection;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add(null);
        set.add(null);
        set.add(null);
        set.add(null);
        set.add(null);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);

        set.add(null);
        System.out.println(set.add(2));
        System.out.println(set);
        List list=Arrays.asList("USA","USA","USA","Brazil","Turkey","Russia");
        System.out.println(list);
        set.addAll(list);
        System.out.println(set);
//        set.clear();
        System.out.println(set);
        System.out.println(set.contains("USA"));
        Set<String> names=new HashSet<>();
        names.add("Anna");
        names.add("Zoltan");
        HashSet<String> lastNames=new HashSet<>();
        lastNames.add("Kenricks");
        lastNames.add("Kinga");
        HashSet<Integer> ages=new HashSet<Integer>(20);
        ages.add(100);
        ages.add(21);
        ages.add(22);
        ages.add(23);
        ages.add(35);
       // System.out.println(ages.hashCode());
        System.out.println(ages.isEmpty());
        Iterator<Integer> iterator=ages.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ages.remove(21);
        System.out.println(ages.remove(22));
        System.out.println(set);
        List nums=Arrays.asList(100,35);
        System.out.println(ages);
//        ages.removeAll(nums);
//        System.out.println(ages);
        System.out.println(ages.size());
        Object[] arr=ages.toArray();
        System.out.println(Arrays.toString(arr));
        Integer[] newArr=new Integer[ages.size()];
        Integer[] intarr=ages.toArray(newArr);
        System.out.println(intarr[1]);

    }
}
