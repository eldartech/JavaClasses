package arrayList.classRoomApp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClassRoom {
    /*
    objects of student class at least 5
    store objects in to an ArrayList

     */
    public static void main(String[] args) {
        Student student=new Student("John","Doe",30,'m',1231231234,"john@gmail.com",86);
        Student student1=new Student("Anna","Hendricks",25,'F',422323423,"a.hendricks@yahoo.com",80);
        Student student2=new Student("Jessica","Alba",27,'f',43242423,"jessica@hotmail.com",75);
        Student student3=new Student("Samuel","Bricks",28,'k',10012023,"bricks@yahoo.com",65);
        Student student4=new Student("Jack","Hendricks",31,'m',422323423,"a.hendricks@yahoo.com",69);
        Student student5=new Student("Anna","Simmerson",23,'F',97646332,"a.simmerson@fb.com",90);

        List<Student> students = Arrays.asList(new Student[]{student,student1,student2,student3,student4,student5});
        //System.out.println(student3);
        List<String> studentsByGPA= Student.getStudentsByGPA(students,80);
      //  System.out.println(studentsByGPA);//unsorted print
//        System.out.println(Student.getStudentsByGPA(students,75));
        Collections.sort(studentsByGPA);
    //    System.out.println(studentsByGPA);//sorted print out
     //   Student.printStudentNames(students);
      //  Student.printStudentInfo(students,"Anna","Hendricks");

        System.out.println(Student.getStudentsByGPA(students,91));
        student1.setGpa(60);
        System.out.println(student1.getGpa());
        System.out.println(student1);

    }
}
