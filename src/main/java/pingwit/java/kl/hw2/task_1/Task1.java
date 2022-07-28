package hw2.task_1;

//+-
//Вопрос задачи: сколько он пробежит суммарно за все дни. Программа ответ не дает
// done
public class Task1 {
    public static void main(String[] args) {
        double b = 10;
            for (int i = 1;i <=7 ; i = i + 1) {
                System.out.println("на " + i + " день він пробіг суммарно " + b + " km");
               // System.out.println(b);
                b = b * 1.1;
            }
    }
}
