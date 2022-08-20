package fileReaders;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFileReader {
    public static void main(String[] args) throws IOException {
        File file=new File("src/fileReaders/test.txt");
        Scanner scanner=new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write("Hello Selenium");
        fileWriter.close();

    }
}
