package stringIntro;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner userInfo = new Scanner(System.in);

        System.out.println("Your first name, please");
        String firstName=userInfo.nextLine();

        System.out.println("Your Last name, please");
        String lastName =userInfo.nextLine();

        System.out.println("Your age?");
        int age =userInfo.nextInt();

        System.out.println("What is your zipcode?");
        int zipcode= userInfo.nextInt();
        userInfo.nextLine();
        System.out.println("How do you identify?");
        String gender =userInfo.nextLine();

        System.out.println("Do you smoke? yes or no (small caps)");
        boolean no = true;
        boolean yes = false;
        String isnotSmoker = userInfo.nextLine();
        if (no) {
            System.out.println("Good job!Do you drink?");
        }
        String isSmoker = userInfo.nextLine();

        if (yes) {
            System.out.println("ew, You should quit.Do you drink? yes/no");
        }
        String isnotDrinker = userInfo.nextLine();
        if (no) {
            System.out.println("Good job!");
        }
        if (yes){
            System.out.println("Okay...");
        }
        System.out.println("Do you have allergies?");
        String isAllergic = userInfo.nextLine();
        if (no) {
            System.out.println("Cool!");
        }
        if (yes) {
            System.out.println("You need to see a shaman");
        }
        System.out.println("Did you recently have surgery?");
        String hadSurgery = userInfo.nextLine();
        if (no) {
            System.out.println("Cool!");
        }
        if (yes) {
            System.out.println("Get well");

        }
        System.out.println("Alright, please check your information " +
                "\nName" +firstName+
                "\nLast Name " +lastName+
                "\nAge " +age+
                "\nGender " +gender+
                "\nisSmoking " +isnotSmoker+
                "\nisAlcohol " +isnotDrinker+
                "\nisAllergy " +isAllergic+
                "\nisSurgery "+hadSurgery);
    }
}
