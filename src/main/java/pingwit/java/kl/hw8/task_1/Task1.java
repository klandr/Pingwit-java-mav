package hw8.task_1;

//+- Название класса должно быть Task1
public class Task1 {
    //не хватает модификатора доступа. Когда метод используется только в классе, есть смысл использовать private 
    static int myDivide(int a, int b) {
//лишняя пустая строчка
        if (b != 0) { //джава сама выкинет исключение при попытке поделить на 0 и его можно словить и обработать
            int x; // можно написать без переменной
            x = a / b;
            return x;
        } else {
            System.out.println("ay yai yai your mum don't afford you divide on 0  ");
            return b; // i don't understand for what this return <- потому что метод всегда должен что-то возвращать, если он не воид. можно в таком случае возвращать нулл
        }
    }
    public static void main(String[] args) {
        //в идеале было бы добавить, чтобы пользователь сам вводил число, но так тоже может быть для теста
        System.out.println(myDivide(6, 2));
        System.out.println(myDivide(7, 0));
    }
}
