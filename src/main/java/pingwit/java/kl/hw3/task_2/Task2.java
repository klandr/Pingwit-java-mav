package hw3.task_2;

//+ код не отформатирован
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[3]; //для более короткой записи можно было использовать {3, 5, 8}

        array[0] = 3;
        array[1] = 5;
        array[2] = 8;
        //рабочий вариант, но если чисел будет больше, лучше всё же использовать цикл
        System.out.println((array[0]+array[1]+array[2])/3);
        }
}
