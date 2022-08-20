package arrays;

public class ArrayIntro {
    public static void main(String[] args) {
    int [] studentIds = new int[5];
    // Array works with index numbers
        studentIds[0]=1;
        studentIds[1]=2;
        studentIds[2]=1;
        studentIds[3]=6;
        studentIds[4]=2;
      // studentIds[5]=2; -> ArrayIndexOutOfBoundsException
        // There is two ways to create string with values which are shown below.
        String [] names = new String[2];
        names[0]="Name";
        names[1]="Name2";
       // names[2]="name3";
        String[] studentNames = new String[]{"name 1","name 2","name 3","name 4"};
        // How can I change the "name 1"?
        studentNames[0]= "Burak";

        // dataType[] nameOfVariable = new dataType[lengthOfArray];
        char [] d = new char[3];
        boolean [] b = new boolean[7];

    }
}
