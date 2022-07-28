package hw2.task_2;

//+-
//Не забываем форматировать код: for должно быть на уровне int a
//Лишние пустые строки - стараемся их всегда убирать
public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 3; i <= 24; i = i + 3) {
            a = a + a;
            System.out.println("за " + i + " години буде " + a + " амеб");
        }
    }
}
