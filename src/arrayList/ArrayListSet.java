package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSet {
    public static void main(String[] args) {
        ArrayList<String> vegies = new ArrayList<>();
        vegies.add("carrot");
        vegies.add("eggplant");
        vegies.add("potatoes");
        System.out.println(vegies);
        vegies.set(0,"onion");

        System.out.println(vegies);
        String password=isValidPassword();
        if (password.isEmpty()){
            System.out.println("Please generate password with letters only");
        }else {
            System.out.println("you have successfully generated password");
        }

        if (vegies.isEmpty()){
            System.out.println("There is no vegies stored in list.");
        }else {
            System.out.println("Here is the list of vegies to choose: "+vegies);
        }
    }

    static String isValidPassword(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter new password:");
        String password=scanner.next();
        boolean isLetter=true;
        for(int j=0;j<password.length();j++){
            if (!Character.isLetter(password.charAt(j))){
                isLetter=false;
                break;
            }
        }
        if(isLetter){
            return password;
        }
        return "";
    }
}
