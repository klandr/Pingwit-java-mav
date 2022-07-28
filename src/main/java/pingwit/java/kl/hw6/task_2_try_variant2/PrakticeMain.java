package hw6.task_2_try_variant2;

//Я так понимаю, что этот класс тут случайно оказался 
public class PrakticeMain {
    public static void main(String[] args) {
        String name = "Egorka";

        Animal animal_1 = new Animal(name);
        Animal animal_2 = new Animal(name);

        boolean isEquals = animal_1.equals(animal_2);
        System.out.println(isEquals);
    }
record Animal(String name){

}

}
