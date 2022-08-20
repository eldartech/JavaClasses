package switchStatement;

import java.util.Scanner;

public class CountAreaOfShapes {
    /*
    using scanner ask user to input the name of the shape
    using switch statement and formula for specified shape
    calculate the area of it.
    square, rectangle, triangle, circle,
    - ask user to enter the related numbers
    to calculate the area

    square => Area = a*a
    rectangle => Area = width*height
    triangle => Area = base*height*0.5
    circle => Area = 3.14*radius*radius
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select the shape: \nsquare\nrectangle\ntriangle\ncircle");
        String shape = input.next();
        float area=0;
        switch (shape){
            case "square":
                System.out.println("Please enter the side of square:");
                float a=input.nextFloat();
                area=a*a;
                break;
            case "rectangle":
                System.out.println("Please enter the width:");
                float w=input.nextFloat();
                System.out.println("Please enter the height:");
                float h=input.nextFloat();
                area = w*h;
                break;
            case "triangle":
                System.out.println("Please enter the base of triangle:");
                float b = input.nextFloat();
                System.out.println("Please enter the height of triangle:");
                float verticalH = input.nextFloat();
                area = (b*verticalH)*0.5f;
                break;
            case "circle":
                System.out.println("Please enter the radius of circle?");
                float r = input.nextFloat();
                area = 3.14f*(r*r);
                break;
            default:
                System.out.println("Invalid option.");
        }
        if (area!=0){
            System.out.println("Area of "+shape+" is "+area);
        }else {
            System.out.println("Invalid entry.");
        }

    }
}
