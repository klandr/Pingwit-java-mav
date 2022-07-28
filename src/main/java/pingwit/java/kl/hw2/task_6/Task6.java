package hw2.task_6;

//+-
public class Task6 {
    public static void main(String[] args) {
        //int z; //остаток от деления - это целое число
        for (int i = 2; i <= 100; i++) {
            //z = i % 2; //можно написать без использования переменной *ok
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
    }
}
