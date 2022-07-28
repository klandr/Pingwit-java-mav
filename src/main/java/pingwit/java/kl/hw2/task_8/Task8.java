package hw2.task_8;

//+-
public class Task8 {
    public static void main(String[] args) {
        int myOdd = 0; //название переменной должно что-то значить
        int myEven = 0;
        float e = 0;
        //Даны числа от 0 до 100, не до 9
        for (int i = 0;i<=99;i++){
            e = i % 2;
            if (e == 1) {
                myOdd = myOdd + i;
            }
            else {
                myEven = myEven + i;
            }
        }
        System.out.println("summ of even numbers = " + myEven); //четные - even, нечетные - odd
        System.out.println("summ of odd numbers = " + myOdd);
        System.out.println("summ of even and odd numbers = " + (myOdd+myEven));
    }
}
