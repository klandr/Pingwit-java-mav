// Оригінальний код: https://tinyurl.com/o8ry24f
package sets;

//нам потрібні інтерфейс Set (множина) і клас TreeSet, який його реалізує
import java.util.Set;
// детальніше про TreeSet - відсортовану множину - https://www.codeflow.site/ru/article/java-tree-set
import java.util.TreeSet;
//
import java.util.Scanner;

// Клас, що містить дії над множинами
public class Operations {

    // Об'єднання множин
    public static <T> Set<T> union(Set<T> setA, Set<T> setB) {
        // створюємо тимчасову множину - копію А, додаємо туди всі елементи з В і повертаємо результат
        Set<T> tmp = new TreeSet<>(setA);
        tmp.addAll(setB);
        return tmp;
    }

    // Перетин множин
    public static <T> Set<T> intersection(Set<T> setA, Set<T> setB) {
        // створюємо тимчасову множину, перебираємо елементи з А, і якщо елемент міститься також у В,
        //додаємо його в тимчасову множину. Після того, як перевіримо всі елементи А - повертаємо результат
        Set<T> tmp = new TreeSet<>();
        for (T x : setA) {
            if (setB.contains(x)) {
                tmp.add(x);
            }
        }
        return tmp;
    }

    // Різниця множин
    public static <T> Set<T> difference(Set<T> setA, Set<T> setB) {
        // створюємо тимчасову множину - копію А, видаляємо з неї всі елементи з В і повертаємо результат
        Set<T> tmp = new TreeSet<>(setA);
        tmp.removeAll(setB);
        return tmp;
    }

    // Симетрична різниця множин
    public static <T> Set<T> symDifference(Set<T> setA, Set<T> setB) {
        // створюємо дві тимчасові множини - перша - об'єднання А і В, доуга - перетин А і В
        // знаходимо різницю між першою і другою й повертаємо результат
        Set<T> tmpA;
        Set<T> tmpB;
        tmpA = union(setA, setB);
        tmpB = intersection(setA, setB);
        return difference(tmpA, tmpB);
    }

    // Чи множина А є підмножиною В?
    public static <T> String isSubset(Set<T> setA, Set<T> setB) {
        //якщо B містить А - повертаємо 'так', інакше - 'ні'
        return setB.containsAll(setA) ? "так" : "ні";
    }

    // Чи множина А містить множину В?
    public static <T> String isSuperset(Set<T> setA, Set<T> setB) {
        //якщо А містить В - повертаємо 'так', інакше - 'ні'
        return setA.containsAll(setB) ? "так" : "ні";
    }

    //Введення множини з клавіатури
    public static <T> Set<T> createSet() {
        // читаємо з клавіатури значення за значенням, додаючи їх до тимчасової множини
        // коли людина введе 'end' припиняємо зчитування і повертаємо множину
        System.out.println("Після кожного елементу натискайте <Enter>, \n"
                + "для завершення вводу замість чергового елементу введіть end ");
        Scanner s = new Scanner(System.in);
        String tmp = "";
        Set<T> tmpSet = new TreeSet<>();
        while (true) {
            tmp = s.nextLine();
            if (tmp.equalsIgnoreCase("end")) {
                break;
            }
            tmpSet.add((T) tmp);
        }
        System.out.println("Множину з " + tmpSet.size() + " елементів створено успішно! ");
        return tmpSet;
    }

    //Службовий метод для виводу на екран рядка з потрібної кількості вказаних символів
    public static void printLine(char template, int cols) {
        String format = "%" + cols + "s";
        System.out.println(String.format(format, "").replace(' ', template));
    }

    //Демонструємо виконання дій
    public static void main(String args[]) {
        //Параметри для виводу відокремлюючих 'ліній' - довжина і символ для формування лінії
        int num = 65;
        char c ='-';

        //Створюємо дві множини
        System.out.println("Введіть елементи першої множини.");
        TreeSet<String> set1 = new TreeSet<>(createSet());
        printLine(c, num);
        System.out.println("Введіть елементи другої множини.");
        TreeSet<String> set2 = new TreeSet<>(createSet());
        printLine(c, num);

        //Виводимо множини на екран
        System.out.println("Множина 1: " + set1);
        System.out.println("Множина 2: " + set2);
        printLine(c, num);

        //Виводимо результати дій над множинами
        System.out.println("Об'єднання: \t\t" + union(set1, set2));
        System.out.println("Перетин: \t\t" + intersection(set1, set2));
        System.out.println("Різниця: \t\t" + difference(set1, set2));
        System.out.println("Симетрична різниця: \t" + symDifference(set1, set2));
        printLine(c, num);

        //Додаємо третю множину (перша без останнього елемента)
        TreeSet<String> set3 = new TreeSet<>(set1);
        set3.remove(set3.last());

        //Виводимо множину на екран
        System.out.println("Множина 3: " + set3);
        printLine(c, num);

        //Перевіряємо хто для кого є підмножиною або супермножиною
        System.out.println("Перша множина є підмножиною другої? \t" + isSubset(set1, set3));
        System.out.println("Перша множина містить третю? \t\t" + isSuperset(set1, set3));
        System.out.println("Третя множина є підмножиною першої? \t" + isSubset(set3, set1));
        System.out.println("Третя множина містить першу? \t\t" + isSuperset(set3, set1));

    }
}