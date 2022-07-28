package hw7;

//+- каждое задание должно быть в отдельном пакете, название класса должно быть в CamelCase, т.е. Task1 - относится ко всей домашке
public class task_1 {
    public static void main(String[] args) {
        String myText = "engineer";//по заданию слово "engineering", а не "engineer". Не усложняй себе задачу :)

        System.out.println(myText.substring(0, 6));
        System.out.println(myText.charAt(myText.length()-1)+myText.substring(3,5)+myText.charAt(2));
     }
}
