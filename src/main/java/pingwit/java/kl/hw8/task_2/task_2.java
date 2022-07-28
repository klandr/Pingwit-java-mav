package hw8.task_2;

//+, но можно добавить взаимодействие пользователя  программы, чтобы он мог вводить значение
//Написать метод, который бы парсил строку в число, обработать исключение,
// которое может быть при неверном формате числа
public class task_2 {
    public static void main(String[] args) {
        String fieldText = "70.";
        try {
            int c = Integer.parseInt(fieldText);
            System.out.println(c);
        } catch (NumberFormatException e) {
            System.out.println("write correct number, please");
        }
    }
}
