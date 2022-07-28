package hw3.task_3;

import java.util.Arrays;

 //+
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 66;
        array[1] = 13;
        array[2] = 6;
        array[3] = 15;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] % 2 == 1) {
                array[i] = 0;
            }
        }
        System.out.print(Arrays.toString(array));
        //Лишняя пустая строчка
    }
}
