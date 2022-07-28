package hw2.task_4;

//+
public class Task4 {
    public static void main(String[] args) {

        int a = 10; // first figure <- комментарии стараемся писать на английском
        int b = 8; // second figure                                                 * done :)
        int result = 0;
        //Hint: количество итераций может быть оптимизировано, если добавить одну проверку
        for (int i = 1; i <= b; i++) {
            result = result + a;
        }
        System.out.println(a + " * " + b + " = " + result);
    }
}
