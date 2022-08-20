package methods.techtorial;

import java.util.Scanner;

public class TestStudents {
    public static void main(String[] args) {
        Students students=new Students();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        do{
            System.out.println("First Name:");
            students.firstName= scanner.next();
            System.out.println("Last Name:");
            students.lastName= scanner.next();
            System.out.println("Age:");
            students.age= scanner.nextInt();
            students.addStudent();
            i++;
        }while (i<students.ages.length);
        students.printStudentInfo();
    }
}
