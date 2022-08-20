package projects.Mar10Project4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String style1 = "Classical";
        String style2 = "Pop";
        String style3 = "Country";
        System.out.println("Classical\nPop\nCountry");
        Scanner userInput = new Scanner(System.in)  ;
        System.out.println("Pick a style");
        String enteredStyle = userInput.nextLine();

        if (enteredStyle.equalsIgnoreCase(style1)){
            System.out.println("These are available songs\n1-Four Seasons\n2-Fur Elise\n3-Finlandia" +
                    "\n4-Vocalise\n5-Planet\nWhich one do you want to listen? / pick a number");
            int pickedSong1 = userInput.nextInt();
                    if (pickedSong1==1 || pickedSong1==2 ||  pickedSong1==3 ||  pickedSong1==4
                            ||  pickedSong1==5 ){
                       System.out.println(pickedSong1 + " is available and please enter $2 for this song");
                       double enteredMoney = userInput.nextDouble();

                                    if (enteredMoney>2) {
                                        System.out.println("Here is your change" +
                                                (enteredMoney-2) +" " + pickedSong1 + " music is playing" );
                                    } else  if (enteredMoney==2) {
                                        System.out.println(pickedSong1 + " song is playing");
                                    } else {
                                        double a =2;



                                        for (   ;  enteredMoney<a ;   ) {

                                            System.out.println("you need to enter " + (a-enteredMoney) + " more");
//                                            System.out.println("do you want to quit?");
//                                            String answer = userInput.next();
//                                            if (answer.equalsIgnoreCase("y"))
//                                                System.exit(1);

                                            System.out.println("enter more money?");
                                            enteredMoney = enteredMoney + userInput.nextDouble();


                                        }

                                        System.out.println("playinggggg");








                                    }



                      } else {
                             System.out.println(pickedSong1 + " is not available");
                       }

        } else if (enteredStyle.equalsIgnoreCase(style2)){
            System.out.println("please enter money");
            double money = userInput.nextDouble();
            // 4usd dolar needs to places but he put less than 4

            // money but we need total 4
            double c =4;
            double sum = 0;

            for (    ; sum < c  ;    ){

                System.out.println("missing amount " + (c-sum) );
                sum = sum + userInput.nextDouble();
                System.out.println("please enter more money");



            }
            System.out.println("playingggg");







        } else if (enteredStyle.equalsIgnoreCase(style3)) {
            System.out.println("jsdhfg");
        } else {
            System.out.println(enteredStyle+ "  is not in the system" );
        }


String s = " ";




    }
}
