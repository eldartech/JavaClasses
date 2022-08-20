package arrays;

import java.util.Arrays;

public class ArrayPrintElements {

    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Ana";
        names[1] ="Mary";
        names[2] = "John";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        // How can I find array's length?
        //     names.length;
        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]);
        }

        System.out.println(Arrays.toString(names));
    }
}
