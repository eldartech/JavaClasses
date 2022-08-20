package methods.batch1;

public class StudentsBatch1 {
    String firstName;
    String lastName;
    String age;

    void printStudentInfo(){
        String[] firstNames=firstName.split(" ");
        String[] lastNames=lastName.split(" ");
       String[] ages = age.split(" ");
       for (int i=0;i<firstNames.length;i++){
           System.out.println(firstNames[i]+" "+lastNames[i]+" "+ages[i]);
       }
        System.out.println("Amount of Students is: "+firstNames.length);
    }

}
