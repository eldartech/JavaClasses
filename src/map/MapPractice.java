package map;

import setCollection.linkedHashSet.LinkedHashSetLesson1;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        //Map Declaration
        Map<String,Integer> names = new HashMap<>();
        //put(Object key,Object values)
        names.put("Adam",35);
        System.out.println(names);
        names.put("Adam",20);//value of "Adam" will be overridden
        System.out.println(names);
        names.put(null,100);
        System.out.println(names);
        names.put(null,90);
        System.out.println(names);
        //keys have to be unique, duplicate keys are going to be overriding the value
        //duplicate values are allowed
        names.put("Alex",90);
        System.out.println(names);
        names.put("Nick",null);
        names.put("Sam",null);
        System.out.println(names);
        //get(Object keyObject)
        Map<Character,Boolean> vowelsMap=new HashMap<>();
        vowelsMap.put('A',true);// 23425
        vowelsMap.put('B',30>100);//23426
        vowelsMap.put('C',"java".startsWith("j"));
        vowelsMap.put("java".charAt(0),true);
        System.out.println(vowelsMap);

        Map<Integer,Integer> nums=new Hashtable<>();//Hash table is synchronized - slower than HashMap
        nums.put(123,100);

     //  nums.put(null,123);//no null key or value allowed, NullPointerException
        System.out.println(nums);
        Map map=new Hashtable();
        HashMap hashMap=new HashMap();
        Hashtable hashtable=new Hashtable();
        LinkedHashMap linkedHashMap=new LinkedHashMap();
        linkedHashMap.put("Carrot",10);
        linkedHashMap.put(true,'A');
        linkedHashMap.put(null,null);
        System.out.println(linkedHashMap);
        linkedHashMap.put("tomato",null);
        linkedHashMap.put("cucumber",null);
        linkedHashMap.put(null,123);
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get("cucumber"));

        TreeMap<Integer,Double> treeMap = new TreeMap();
       // treeMap.put(1, null);//null key are not allowed in TreeMap, NullPointerException
      // System.out.println(treeMap);
        for (int i=100;i>0;i--){
            treeMap.put(i,Double.parseDouble(""+i));
        }
        System.out.println(treeMap);



    }
}
