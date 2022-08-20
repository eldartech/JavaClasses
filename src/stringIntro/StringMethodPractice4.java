package stringIntro;

import java.util.Locale;

public class StringMethodPractice4 {
    public static void main(String[] args) {
        //equals() true/false (boolean)
        String str3="America";
        System.out.println(str3.equals("America"));
        //equalsIgnoreCase() true/false (boolean)
        String str4 = "Russia";
        System.out.println(str4.equalsIgnoreCase("russia"));
        String country1="USA";
        String country2="UAE";
        System.out.println(country1.equals(country2));

        String country3="usa";
        System.out.println(country1.equalsIgnoreCase(country3));

        String str5="Worlddd";//World
        System.out.println(str5.charAt(2));
        System.out.println(str5.indexOf("ddd"));
        System.out.println(str5.replace("W","w"));
        System.out.println(str5.replace("r","d"));
        System.out.println(str5);
        str5=str5.replace("ddd","d");
        System.out.println(str5.toUpperCase());
        System.out.println(str5);


    }
}
