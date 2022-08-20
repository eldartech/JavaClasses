package methods.techtorial;

public class Students {
    /*
    you will have application which stores the first name (array),
     last name(array) and age(array) of student
    if user wants to continue you will ask and store names and age
    print out in format of :
    Fistname Lastname Age
    Adam Sendler 35
    Amount of students: 12

     */
    String firstName;
    String lastName;
    int age;
    String[] firstNames=new String[3];
    String[] lastNames = new String[3];
    int[] ages = new int[3];
    int count;

    void addStudent(){
        firstNames[count]=firstName;
        lastNames[count]=lastName;
        ages[count]=age;
        count++;
    }

    void printStudentInfo(){
        for (int i=0;i<ages.length;i++){
            System.out.println(firstNames[i]+" "+lastNames[i]+" "+ages[i]);
        }
        System.out.println("Amount of Students is: "+count);
    }


}
