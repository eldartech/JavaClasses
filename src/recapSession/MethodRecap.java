package recapSession;

public class MethodRecap {
    public static void main(String[] args) {
        String success = "hardworking";
        System.out.println(success.indexOf("in"));

        String threeWords ="One Two Three"
;    int indexOfFirstSpace = threeWords.indexOf(" ");
        String firstWord = threeWords.substring(0,indexOfFirstSpace);

        int indexOfSecondSpace = threeWords.indexOf(" ",indexOfFirstSpace+1);

        String secondWord = threeWords.substring(indexOfFirstSpace+1,indexOfSecondSpace);
      String thirdWord = threeWords.substring(indexOfSecondSpace+1);
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);


























    }
}
