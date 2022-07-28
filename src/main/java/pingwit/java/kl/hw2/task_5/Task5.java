package hw2.task_5;

//+
public class Task5 {
    public static void main(String[] args) {
        double inch = 2.54; //имя переменной должно что-то значить *ok
        double w ;
        for (int i = 1; i <= 20; i++) {
            w = inch * i; //hint: можно реализовать через сумму
            System.out.println(i + " inches = " + w + " cm");
        }
    }
}
