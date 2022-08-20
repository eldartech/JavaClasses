package arrayList;

import utilityMethods.ArrayMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> numList= new ArrayList<>();
        numList.add(123);  //using the value
        numList.add(0,1000);//using index and value
        System.out.println(numList);
        System.out.println(numList.get(0));
        ArrayList<String> words=new ArrayList<>();
        words.add("banana");
        words.add("apple");
        System.out.println(words);
        words.add(1,"pine apple");
        System.out.println(words);
        words.add(0,"orange");
        System.out.println(words);
        words.add(1, "strawberry");
        System.out.println(words);


        List cars=new ArrayList();
        cars.add("bmw");
        System.out.println(cars);
        cars.add(1,"Honda");
        System.out.println(cars);
        cars.add(1,"Toyota");
        System.out.println(cars);
        cars.add(3,"Renault");
        cars.add(4,"Lincoln");
        cars.add(5, "Lexus");
       // System.out.println(cars.get(6));
        //remove(int index)
        cars.remove(0);
        System.out.println(cars);
        cars.remove("Lexus");
        System.out.println(cars);
        cars.set(0,"Mercedes-Benz");
        System.out.println(cars);
        //
        System.out.println(cars.size());
        System.out.println(cars.isEmpty());
        ArrayList<String> list=new ArrayList();
        System.out.println(list.isEmpty());
        System.out.println(cars.contains("Lexus"));
        System.out.println(cars.contains("Mercedes-Benz"));
       Object [] carsArr= cars.toArray();//ArrayList to Array
        System.out.println(Arrays.toString(carsArr));
        List<Object> list1=  Arrays.asList(carsArr);//Array to List

        cars.clear();
        System.out.println(cars);
        System.out.println(list1);
        Object[] diff={true,123,"alkdsfj",12.3};



    }
}
