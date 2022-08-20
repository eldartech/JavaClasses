package switchStatement;

import java.util.Scanner;

public class WarmUpTask {
    /*
    using scanner
    - ask student to enter his/her first name
    - ask student to enter his/her last name
    - ask student to enter his/her age
    - ask student to select the programming language
            java, javascript, python, ruby, c#, c
        - ask for his experience
    - print out
    - Fist name capitalized
    - Last name capitalized
    - generate password for user using first name and lastname mix of special chars
            At least 8 characters—the more characters, the better
            A mixture of both uppercase and lowercase letters
            A mixture of letters and numbers
    - print year of birth
    - Programming language: Java
      Experience: 2 year
    - 0-1 -> beginner
    - 1-3 -> intermediate
    - 3 and up advanced
     */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = sc.next();
        System.out.println("What is your last name?");
        String lastName = sc.next();
        System.out.println("What is your age?");
        int age  = sc.nextInt();
        System.out.println("Please select the programming language: \nJava\nJava Script\nPython\nRuby\nC#\nC");
        String language = sc.next();
        System.out.println("How many years of experience do you have with "+language+"?");
        int years= sc.nextInt();

        System.out.println("Fist Name: "+firstName.toUpperCase());
        System.out.println("Last Name: "+lastName.toUpperCase());
        String password= firstName
                .substring(firstName.length()/2)
                .replace(""+firstName.substring(firstName.length()/2).charAt(0),"$")
                .concat(lastName.substring(lastName.length()/2).toUpperCase()+"@#$%^");
        System.out.println("Password: "+password);
        int yearOfBirth=2022-age;
        System.out.println("Year of Birth: "+yearOfBirth);
        System.out.println("Programming language: "+language);
        System.out.println("Experience: "+years);
        switch (language) {

            case "Python":
                System.out.println("case 2");
                break;
            case "C#":
                System.out.println("case 3");
                break;
            case "Java":
                if (years>3){
                    System.out.println("Do you know OOP concepts?");
                    String answer1 = sc.next();
                    if (answer1.equalsIgnoreCase("yes")){
                        System.out.println(firstName+" knows OOP concepts.");
                    }else {
                        System.out.println(firstName+" does not know OOP concepts");
                    }
                }else if (years>1 && years<3){
                    System.out.println("Do you know String method chaining?");
                    String answer2 = sc.next();
                    if (answer2.equalsIgnoreCase("yes")){
                        System.out.println(firstName+" knows String method chaining.");
                    }else {
                        System.out.println(firstName+" does not know String method chaining.");
                    }
                }else {
                    System.out.println("Do you know primitive data types?");
                    String answer1 = sc.next();
                    if (answer1.equalsIgnoreCase("yes")){
                        System.out.println(firstName+" knows primitive data types");
                    }else {
                        System.out.println(firstName+" does not know primitive data types");
                    }
                }
                break;
            case "Java Script":
                System.out.println("case 4");
                break;
            case "Ruby":
                System.out.println("case 5");
                break;
            case "C":
                System.out.println("case 5");
                break;
            default:
                System.out.println("default case");

        }
        if (years>=3){
            System.out.println("Assigned class: Advanced");
        }else if (years>1 && years<3){
            System.out.println("Assigned class: Intermediate");
        }else {
            System.out.println("Assigned class: Beginner");
        }




    }
}
