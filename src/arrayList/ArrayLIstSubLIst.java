package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLIstSubLIst {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=10;i<=100;i=i+10){
            numbers.add(i);
        }
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);
        List<Integer> subList=numbers.subList(numbers.indexOf(20),numbers.indexOf(100));
        System.out.println(subList);
        int [] nums={123,42,534,234,2,3,4,5,6,7,8};
        List numsList= Arrays.asList(nums);
        Object[] numberArr=numbers.toArray();
//        Collections.sort(numbers);
//        for (Integer number:numbers){
//            System.out.println(number);
//        }
        Collections.sort(numbers,Collections.reverseOrder());
        for (Integer number:numbers){
            System.out.println(number);
        }

        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,4,10,5,5}));
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(new String[]{"java","python"}));
        List<String> cards = Arrays.asList(new String[]{"Master Card","Visa","Capital One"});
        List<String> cardsSubList = cards.subList(1, cards.size());
        System.out.println(cardsSubList);



    }
}
