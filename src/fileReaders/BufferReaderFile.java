package fileReaders;

import java.io.*;

public class BufferReaderFile {
    public static void main(String[] args) throws IOException {
        try{
            File file=new File("src/fileReaders/test.txt");
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String str;
            while ((str=bufferedReader.readLine())!=null){
                System.out.println(str);
            }
        }catch (FileNotFoundException e){
            System.out.println("There is no file.");
        }

    }
}
