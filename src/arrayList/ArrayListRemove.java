package arrayList;

import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        //Remove Method Practice
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("grapefruit");
        fruits.add("grapefruit");
        fruits.add("orange");
        fruits.add("orange");
        fruits.add("pine-apple");
        fruits.add("pine-apple");
        fruits.add("kiwi");
        fruits.add("kiwi");
        System.out.println(fruits);
//        fruits.remove("apple");
//        System.out.println(fruits);
//        fruits.remove(1);
//        System.out.println(fruits);
    ArrayList<String> cars = new ArrayList<>();
        System.out.println(getUnique(cars));
//        for (int i=0;i< fruits.size();i++){
////            for (int j=i+1;j<fruits.size();j++){
////                if (fruits.get(i).equals(fruits.get(j))){
////                    fruits.remove(j);
////                }
////            }
////        }
        System.out.println(getUnique(fruits));

        if (!fruits.contains("pomegranate")){
            fruits.add("pomegranate");
        }
        System.out.println(getUnique(fruits));
    }

    static ArrayList<String> getUnique(ArrayList<String> list){
        ArrayList<String> result = new ArrayList<>(list);
        for (int i=0;i< result.size();i++){
            for (int j=i+1;j<result.size();j++){
                if (result.get(i).equals(result.get(j))){
                    result.remove(j);
                }
            }
        }
        return result;
    }
}
