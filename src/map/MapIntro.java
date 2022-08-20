package map;

import java.util.*;

public class MapIntro {
    public static void main(String[] args) {
//        Map map = new Map();//compile time error
//        SortedMap sortedMap=new SortedMap();// compile time error
        Map map1= new HashMap();
        Map map2= new Hashtable();
        Map map3 = new TreeMap();
        HashMap hashMap = new HashMap();
        Hashtable hashTable = new Hashtable();
        TreeMap treeMap = new TreeMap();
        SortedMap sortedTreeMap = new TreeMap();
        Set<String> set=new HashSet<>();
        Map<String,Integer> products=new HashMap<>();
        //keys must be unique, if key is duplicate, it will override the value
        //put(Object object, Object object)
        products.put("apple",2);
        products.put("banana",10);
        System.out.println(products);
        products.put("Banana",111);
        System.out.println(products);
        //1 null key allowed, multiple null values
        products.put(null,9);
        System.out.println(products);
        products.put(null,99);
        System.out.println(products);
        //get(Object objetKey), accepts the key, and returns the value
        System.out.println(products.get("banana"));
        System.out.println(products.get(null));
        HashMap<String, Integer> result=new HashMap<>();
        result.put("milk",5);
        result.putAll(products);
        System.out.println(result);


    }
}
