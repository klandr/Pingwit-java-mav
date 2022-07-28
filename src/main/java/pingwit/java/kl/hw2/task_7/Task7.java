package hw2.task_7;

//+-
public class Task7 {
    public static void main(String[] args) {
        int a = 0; //имя переменной должно что-то значить
        //float z = 0; //остаток от деления - это целое число
        for (int i = 1; i <= 99; i++) {
           // z = i % 2; //можно без этой переменной
            if (i%2 == 1) { //yakshcho ne parne to dodayemo <- комментарии не пишем латинкоц: английский предпочтительнее
                a = i + a;
                System.out.println(i);
            }
        }
        System.out.println(a);  //suma chysel <- "Sum of odd numbers from 1 to 99 is ..."
    }
}
