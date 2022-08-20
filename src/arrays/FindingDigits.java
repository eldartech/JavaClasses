package arrays;

public class FindingDigits {
    public static void main(String[] args) {
        char characters[] ={'A','0','!','B','.','1','T','2'};
        // Print only numbers from this array.
        // Using for each loop.
        for (char ch:characters) {
            if (ch<='9'&&ch>='0'){
                System.out.println(ch);
            }
        }







    }
}
