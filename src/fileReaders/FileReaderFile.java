package fileReaders;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderFile {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("src/fileReaders/test.txt");
        int value;
        while ((value=fileReader.read())!=-1){
            System.out.print((char) value);
        }
    }
}
