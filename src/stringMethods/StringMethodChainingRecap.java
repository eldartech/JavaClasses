package stringMethods;

public class StringMethodChainingRecap {
    public static void main(String[] args) {
        /*
        Create a String containing 3 words with spaces at the beginning
        and at the end
            - method chain:
                concat
                replace
                substring
                toUpperCase
                trim
        Create char variable and store one of the letters by chaining:
                toLowerCase
                replace
                charAt

         */
        String wishForTheDay="    Have a blessed and beautiful Sunday";
        //                    01234567891011
        String space="    ";
        String result = wishForTheDay
                .concat(space)
                .replace("a","*")
                .substring(wishForTheDay.indexOf("S"))//S
                .toUpperCase()
                .trim();
        System.out.println(result);
        System.out.println(wishForTheDay);
        char letter = wishForTheDay
                .toLowerCase()
                .replace("e","**")
                .trim()
                .charAt(0);
        System.out.println(letter);

    }
}
