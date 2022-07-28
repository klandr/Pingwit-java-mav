package hw8.task_3;

import java.util.Arrays;
import java.util.Scanner;

//+- Это больше похоже на правду. Но название класса всё еще с большой буквы. Код не отформатирован
//Попросите пользователя ввести число размера будущего массива, но не больше размера Y (задайте сами).
//Если пользователь ввел число больше Y или отрицательное, то выбросьте собственное исключение и
//попросите пользователя ввести число заново.
public class mineExeptionMine {
    public static void main(String[] args) throws mineExeption {
        Scanner scanNumber = new Scanner(System.in);
    String numberSizeArray = null;// i need another type from int,  which can apply the number and the letter <- хороший ход
        int valueOfMassive = 5; //maxSizeValue скорее

        try {
            System.out.println("Enter number between 0 and " +valueOfMassive+", please");
            numberSizeArray = scanNumber.next();
            int a = Integer.valueOf(numberSizeArray);

            if ((a > valueOfMassive) || (a < 0)) {
                //тут стоит сделать выкидывание твоего эксепшена
                System.out.println("your sign = " + numberSizeArray + " Re Enter number between 0 and " +valueOfMassive+", please");
                return;
            }

            int[] myArray = new int[a];
            System.out.println(Arrays.toString(myArray));
            System.out.println("thanks");
//лишняя пустая строка
        } catch (NumberFormatException e) {
            //NumberFormatException и твой эксепшн - это разного рода эксепшены. При NumberFormatException ошибка в том, что пользователь ввел не интеджер и можно ему об этом сказать
            try {
                throw new mineExeption("Enter number", numberSizeArray);//i just print 0 <- я так понимаю, что речь про переменную а. потому что это не наша ошибка, а когда введено не интеджер 
            } catch (mineExeption ee) { // <- Вынеси эту часть во второй кэтч под NumberFormatException и будет огонь
                System.out.println("your sign = " + ee.getCheckNumber() + " Enter number between 0 and " +valueOfMassive+", please");
            }
        }
    }
}
