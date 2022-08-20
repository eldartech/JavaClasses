package arrayList.classRoomApp;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private char gender;
    private int phoneNumber;
    private String email;
    private int gpa;

    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
    int getAge(){
        return age;
    }
    char getGender(){
        return gender;
    }
    int getPhoneNumber(){
        return phoneNumber;
    }
    String getEmail(){
        return email;
    }
    int getGpa(){
        return gpa;
    }
    void setFirstName(String firstName){
        this.firstName=firstName;
    }

    void setLastName(String lastName){
        this.lastName=lastName;
    }

    void setAge(int age){
        this.age=age;
    }

    void setGender(char letter){
        if (letter=='M'||letter=='m'||letter=='F'||letter=='f'){
            gender=letter;
        }else {
            gender='-';
        }
    }

    void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    void setEmail(String email){
        this.email=email;
    }
    void setGpa(int gpa){
        if (gpa>=0&&gpa<=100){
            this.gpa=gpa;
        }else {
            this.gpa=0;
        }
    }

    Student(String firstName,String lastName, int age, char gender, int phoneNumber, String email, int gpa){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setGender(gender);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setGpa(gpa);
    }

    @Override
    public String toString(){
        return "Fist Name: "+getFirstName().toUpperCase()+
                "\nLast Name: "+getLastName().toUpperCase()+
                "\nAge: "+getAge()+
                "\nGender: "+getGender()+
                "\nPhone Number: "+getPhoneNumber()+
                "\nEmail: "+getEmail()+
                "\nGPA: "+getGpa();
    }

    static List<String> getStudentsByGPA(List<Student> students,int gpa){
        List<String> result=new ArrayList<>();
        for (int i=0; i<students.size();i++){
            if (students.get(i).getGpa()>=gpa){
                result.add(students.get(i).getFirstName()+" "+students.get(i).getLastName());
            }
        }
        if (result.isEmpty()){
            System.out.println("There no students with GPA more than "+gpa);
        }
        return result;
    }

   static void printStudentNames(List<Student> students){
        for (Student student: students){
            System.out.printf("%s %s%n",student.getFirstName(),student.getLastName());
        }
    }

   static void printStudentInfo(List<Student> students, String firstName, String lastName){
        for (int j=0;j<students.size();j++){
            if (students.get(j).getFirstName().equals(firstName)&&students.get(j).getLastName().equals(lastName)){
                String info = String.format("First Name: %S%nLast Name: %S%nPhone Number: %d%nEmail: %s"
                        ,students.get(j).getFirstName()
                        ,students.get(j).getLastName()
                        ,students.get(j).getPhoneNumber()
                        ,students.get(j).getEmail()
                );
                System.out.print(info);
            }
        }
    }




}
