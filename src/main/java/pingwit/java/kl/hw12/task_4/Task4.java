package hw12.task_4;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;


//+-
//Task 4
//Ñîçäàòü êëàññ User, ñäåëàòü êîíñòðóêòîð ñ 1 ïàðàìåòðîì, íàïðèìåð, èìÿ.
//Ñîçäàòü ôóíêöèîíàëüíûé èíòåðôåéñ, ñ ìåòîäîì, êîòîðûé áû ñîçäàâàë þçåðà.
// Íàïèñàòü ëÿìáäà-âûðàæåíèå è ñîçäàòü þçåðà
public class Task4 {
    public static void main(String[] args) {
        //это не функциональный интерфейс, а Map. Попробуй использовать Supplier
        Map<String,Integer> users = new HashMap<>();
        //users.put("Den",4);
        System.out.println(users);
        Consumer<String> usrLambda = x -> new HashMap<>() ;
       // Consumer<Integer> usrLambda = x -> users.put("Jeck",44) ;
        usrLambda.equals("Jeck");
        System.out.println(usrLambda);
        System.out.println(users);
    }
}
