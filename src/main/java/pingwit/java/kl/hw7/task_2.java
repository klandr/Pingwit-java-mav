package hw7;

//+
public class task_2 {
    public static void main(String[] args) {
       String someWord = "alucard";

        for (int i=someWord.length()-1;i>=0;i--) {
            System.out.print(someWord.charAt(i)); //выводить хорошр, но лучше сохранить в переменную типа стринг
        }
    }
}
