package forLoop;

public class ForLoopMultipleTerm {
    public static void main(String[] args) {
        int x = 5;             // 0>0&&3<10     //1,4
        for (int y=0,i=10,t=0  ;  x>t&&y<i  ;  x--,y++){
            System.out.println("Inside of loop. x=> "+x+" y=> "+y);
                                                //      3       2
        }
        int sum = 0;
       //    int  x = 65       ;  x<90;x++

        for ( char letter = 'A';letter<='Z';letter++){
           if (letter=='K'){

               continue;
           }
            System.out.println(letter);


        }
        System.out.println("Out of for loop"+sum);


    }
}
