package hw12.task_1;

import java.util.ArrayList;
import java.util.Date;

public class Store {
    public static void main(String[] args) {
        //Date - устарешвий тип,используем LocalDateTime
        Date date = new Date(); //LocalDateTime.now()
        //В коллекции должны быть объекты, которые хронят значение (имя) и время LocalDateTime (created)
        String chicken = new String("Kura");
        String milk = new String("Mleko");
        String eggs = new String("Jajko");
        
        ArrayList<String> storeList = new ArrayList<>();
        //такое храннение усложнит работу с объектом, т.е. для извлечения имени потребуются дополнитеьные действия - используй объект, а не просто строку
        storeList.add((chicken)+" "+date);
        storeList.add((milk)+" "+date);
        storeList.add((eggs)+" "+date);
        System.out.println(storeList);
    }
}
