package methods.batch1;

import java.util.Scanner;

public class TestStudentsBatch1 {
    public static void main(String[] args) {
        StudentsBatch1 studentsBatch1=new StudentsBatch1();
        Scanner scanner=new Scanner(System.in);
        String answer = "";
        studentsBatch1.firstName="";
        studentsBatch1.lastName="";
        studentsBatch1.age="";
        do {
            System.out.println("First Name:");
            studentsBatch1.firstName+= scanner.next()+" ";
            System.out.println("Last Name:");
            studentsBatch1.lastName+= scanner.next()+" ";
            System.out.println("Age:");
            studentsBatch1.age+=scanner.next()+" ";
            System.out.println("Do you want to continue?");
            answer=scanner.next();

        }while (answer.charAt(0)=='Y' || answer.charAt(0)=='y');
        studentsBatch1.printStudentInfo();

    }
}
