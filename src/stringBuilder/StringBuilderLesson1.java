package stringBuilder;

import utilityMethods.StringMethods;

public class StringBuilderLesson1 {
    public static void main(String[] args) {
        StringBuilder city=new StringBuilder("Miami");
        System.out.println(city);
        city.append(" is beautiful.").append(" year ").append(2022+" ").append(true);
        System.out.println(city);

        StringBuilder city2 = new StringBuilder("Chicago").append(" is cold.");
        System.out.println(city2);
        System.out.println(new StringBuilder("New York").append("Year"+2022));
        System.out.println(city.indexOf("M"));

        //insert()

        city.insert(2,"-");
        System.out.println(city);

        //reverse()
        StringBuilder word=new StringBuilder("Techtorial");
        word.reverse();
        System.out.println(word);

        /*in UtilsMethod package create a method which will reverse
        String using String builder
        so it accept 1 String and return StringBuilder
         */
        System.out.println(StringMethods.reverseString("Miami"));

        //delete() removing the char at the specified position
        StringBuilder wordToDelete=new StringBuilder("United States Of America!");
        wordToDelete.delete(0,6);//-->it takes 2 parameters, start and end(exclusive)
        System.out.println(wordToDelete);
        //deleteCharAt() removes the char at the specified position(index)
        wordToDelete.deleteCharAt(wordToDelete.length()-1);
        System.out.println(wordToDelete);

        //setCharAt() char at the specified index will be replaced to given char
        wordToDelete.setCharAt(1,'s');
        System.out.println(wordToDelete);
        System.out.println(wordToDelete.length());
        System.out.println(wordToDelete.capacity());







    }

}
