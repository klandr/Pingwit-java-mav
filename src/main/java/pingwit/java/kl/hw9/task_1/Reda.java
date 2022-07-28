package hw9.task_1;

import java.io.FileReader;
import java.io.IOException;

public class Reda {
    private static final String PATH = "C:\\java projects\\pingvit-java\\src\\hw9\\task_1\\fileToWrite.txt";
    public static void main(String[] args) {
        try (FileReader fr = new FileReader(PATH)){
            int read;
            while ((read = fr.read()) != -1){
                System.out.println((char) read);
            }
            System.out.println();
            String encoding = fr.getEncoding();
            System.out.println(encoding);
        } catch (IOException e ){
            e.printStackTrace();
        }

    }
}
