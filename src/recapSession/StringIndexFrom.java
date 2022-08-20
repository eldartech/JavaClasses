package recapSession;

public class StringIndexFrom {

    public static void main(String[] args) {
        String string = "one two three";
        int indexOfFirstSpace = string.indexOf(" ");
        string.indexOf(" ",indexOfFirstSpace);//

        string.indexOf(" ", indexOfFirstSpace+1);

        // Remove all spaces from this string?
     //   string = string.replace(" ","");
//        System.out.println(string);
       string = string.replaceAll(" ","").
               trim().toLowerCase().substring(1);
        System.out.println(string.equals(" "));

    }








}
