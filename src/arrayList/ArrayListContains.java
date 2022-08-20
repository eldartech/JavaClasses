package arrayList;

import java.util.ArrayList;

public class ArrayListContains {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add("Honda");
        System.out.println(addUnique(cars,"BMW"));
        System.out.println(cars);


    }

    static ArrayList<String> addUnique(ArrayList<String> list, String word){
        ArrayList<String> result = new ArrayList<>(list);
        if (!list.contains(word)){
            result.add(word);
        }
        return result;
    }



}
