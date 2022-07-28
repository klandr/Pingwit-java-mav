package hw9.task_1;
//Task 1
//Есть массив чисел, заполнить его можете любыми цифрами. Нужно записать его в файл


import java.io.*;

public class Task1 {
    //private static final String PATH = "F:\\java projects\\pingvit-java\\src\\hw9\\task_1\\fileToWrite.txt";

    public static void main(String[] args) {
        String path = "c:\\java projects\\pingvit-java\\src\\hw9\\task_1\\fileToWrite.txt";
        //  int[] array = {6, 5, 3, 2, 2, 4, 4, 5, 5, 5};

        writeToFile(path);
        readFromFile(path);
    }

    private static void writeToFile(String path) {
        //for (int a = 0; a<=5; a++) {
            try (FileOutputStream fos = new FileOutputStream(path)) {
                DataOutputStream bos = new DataOutputStream(fos);
                int[] array = {6, 5, 3, 2, 2, 4, 4, 5, 5, 5};
                bos.writeDouble(3.14);
                 //for (int a = 0; a<=(array.length-1); a++) {
                //bos.writeInt(array[a]);
                //bos.w
                 //}
            } catch (IOException e) {
                e.printStackTrace();
            }
        //}
    }


    private static void readFromFile(String path) {
        //for (int i = 0; i==5; i++) {
            try (FileInputStream fis = new FileInputStream(path)) {
                DataInputStream bis = new DataInputStream(fis);
                //System.out.println(bis.readDouble());
                //System.out.println(bis.readInt());
                //System.out.println(bis.readLong());;
            } catch (IOException e) {
                e.printStackTrace();
            }
        //}
    }
}