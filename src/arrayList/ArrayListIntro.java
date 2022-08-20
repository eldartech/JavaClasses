package arrayList;


import java.util.*;

public class ArrayListIntro {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,44,5};
        nums[5]=76;
        System.out.println(nums[5]);
      ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(1);
        ArrayList arrayList1=new ArrayList(10);
        arrayList1.add("word1");
        arrayList1.add(123);//autoboxing
        arrayList1.add(true);
        arrayList1.add('I');
        arrayList1.add("word5");
        arrayList1.add("word6");
        arrayList1.add("word7");
        arrayList1.add("word8");
        arrayList1.add("word9");
        arrayList1.add("word10");
        arrayList1.add("word11");
        arrayList1.add("word11");
        System.out.println(arrayList1.toString());
        ArrayList list2 = new ArrayList(arrayList1);
       System.out.println(list2);
        ArrayList<Integer> listNumbers=new ArrayList<>();
        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        listNumbers.add(4);
        System.out.println(listNumbers);

        ArrayList<Boolean> listConditions=new ArrayList<Boolean>();
        listConditions.add(true);
        listConditions.add(false);
        listConditions.add(5==5);
        listConditions.add("Home".startsWith("H"));
        listConditions.add("Home".equalsIgnoreCase("home"));
        listConditions.add("Home".startsWith("H") && "Home".endsWith("e"));
        System.out.println(listConditions);

        List<Character> listChars = new ArrayList<>();
            for (char letter='Z';letter>='A';letter--){
                listChars.add(letter);
            }
            listChars.remove(new Character('W'));
        System.out.println(listChars);
        UUID idOne = UUID.randomUUID();
        String result = idOne.toString();
        System.out.println(result);

        Collections.sort(listChars);

        System.out.println(listChars);

    }
}
