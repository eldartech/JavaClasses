package projects.project2;

import java.util.Scanner;

public class Task4Project2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter only 6 digit number");
        int number = scanner.nextInt();
        String printNum = "" + number;
        if (printNum.length() == 6) {
            int sum = 0;
            int mult = 0;

            int sixthDigit = number % 10; // 2

            int fiveDigit = number / 10; //578432/10=57834.2
            int fifthDigit = fiveDigit % 10; //4
            int fourDigit = fiveDigit / 10; //57834/10=5783.2
            int fourthDigit = fourDigit % 10;//4
            int threeDigit = fourDigit / 10;
            int thirdDigit = threeDigit % 10;
            int twoDigit = threeDigit / 10;
            int secondDigit = twoDigit % 10;
            int firstDigit = twoDigit / 10;
           System.out.println(firstDigit);
            System.out.println(secondDigit);
            System.out.println(thirdDigit);
            System.out.println(fourthDigit);
            System.out.println(fifthDigit);
            System.out.println(sixthDigit);

            System.out.println("Multiplication of all digits is " + (firstDigit * secondDigit * thirdDigit *
                    fourthDigit * fifthDigit * sixthDigit));
            System.out.println("Sum of all digits is " + (firstDigit + secondDigit + thirdDigit +
                    fourthDigit + fifthDigit + sixthDigit));
        } else if (printNum.length() > 6) {
            System.out.println("Please enter only 6 digits");
            String printNum2 = "" + number;
            int number2 = scanner.nextInt();
            if (printNum2.length() == 6) {
                int sum = 0;
                int mult = 0;

                int sixthDigit = number2 % 10;

                int fiveDigit = number2 / 10;
                int fifthDigit = fiveDigit % 10;
                int fourDigit = fiveDigit / 10;
                int fourthDigit = fourDigit % 10;
                int threeDigit = fourDigit / 10;
                int thirdDigit = threeDigit % 10;
                int twoDigit = threeDigit / 10;
                int secondDigit = twoDigit % 10;
                int firstDigit = twoDigit / 10;
           /*System.out.println(firstDigit);
            System.out.println(secondDigit);
            System.out.println(thirdDigit);
            System.out.println(fourthDigit);
            System.out.println(fifthDigit);
            System.out.println(sixthDigit);*/

                System.out.println("Multiplication of all digits is " + (firstDigit * secondDigit * thirdDigit *
                        fourthDigit * fifthDigit * sixthDigit));
                System.out.println("Sum of all digits is " + (firstDigit + secondDigit + thirdDigit +
                        fourthDigit + fifthDigit + sixthDigit));
            }


        }
    }
}

