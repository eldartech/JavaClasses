package setCollection.hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectUnionDifference {
    public static void main(String[] args) {
        HashSet<Integer> nums1 = new HashSet<>();
        nums1.addAll(Arrays.asList(new Integer[]{1,3,2,4,8,9,0}));
        System.out.println("HashSet #1: "+nums1);
        HashSet<Integer> nums2= new HashSet<>();
        nums2.addAll(Arrays.asList(new Integer[]{1,3,7,5,4,0,7,5}));
        System.out.println("HashSet #2: "+nums2);
        HashSet<Integer> union=new HashSet<>(nums1);
        union.addAll(nums2);
        System.out.println("Union of HashSet#1 and HashSet#2: "+union);
        HashSet<Integer> intersects=new HashSet<>(nums1);
        intersects.retainAll(nums2);
        System.out.println("Intersections of HashSet#1 and HashSet#2: "+intersects);
        HashSet<Integer> difference = new HashSet<>(nums1);
        difference.removeAll(nums2);
        System.out.println("Difference of Hashset#1 and HashSet#2: "+difference);
        System.out.println(union.containsAll(nums1));

    }
}
