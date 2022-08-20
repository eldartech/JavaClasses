package recapSession;

public class IfStatementRecap {

    public static void main(String[] args) {
        boolean bl = false ;

        if(bl=true)
            System.out.println("It is true");
int exam1 = 70;
int attendancy = 85;
// Exam must be at least 70 and attendancy must be at
        // least 90
        if(exam1>=70&&attendancy>=90){
            System.out.println("Passed");
        }else if (exam1>70){
            System.out.println("can make an exception");
        }else{
            System.out.println("couldn't pass");
        }
    }
}
