package doWhileLoop;

import java.util.Scanner;

public class AddStudent {
    /* using scanner
    - ask user to enter name
    - add string to another string if
    user wants to add another student name
    input: please enter name:
                john\n+newName
           do you want to add another student
           yes
           no
             while(answer.equals("yes")

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentList="";
        String answer;
        do {
            System.out.println("Please enter student's name:");
            String name = scanner.next();
            studentList=studentList+name+"\n";
            System.out.println("Do you want to add another student?");
            answer = scanner.next();
        }while (answer.equalsIgnoreCase("YES"));
        System.out.println(studentList);

    }
}
