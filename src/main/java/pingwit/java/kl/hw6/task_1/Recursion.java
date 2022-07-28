package hw6.task_1;

import java.io.OptionalDataException;
import java.util.Arrays;

//+-
//Task 1
//Написать рекурсивную функцию, которая бы перебирала все элементы массива
// и выводила их на экран
public class Recursion {
    public static void main(String[] args) {      //creating massive with numbers. <- этот комментарий лучше перенести на строчку ниже
        int[] numbers = {7, 3, 2, 4, 5, 3, 2, 9};
        int x = 0; //эту переменную можно убрать - она инициализируется и сразу используется 
        counting(x, numbers); //название метода может быть print - внутри метода ничего не считается                     // initialling x, numbers
    }

    public static int counting(int x, int[] numbers) { // initialling x, numbers
        //System.out.println("hello from counting x = " + x); <- не забываем убирать рабочие заметки 
        System.out.print(numbers[x] + " ");
        if (x == (numbers.length - 1)) {
            return x; //метод может быть void - возвращаемое значение не используется
        }
        return counting(++x, numbers); // initialling x, numbers
    }
}
