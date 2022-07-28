package hw4.task_1;

//<<<<<<< HEAD
public class Unit {
    String name;
    int age;

//=======
//+- код не отформатирован 
//public class Unit {
//    String name; //поля не приватные
  //  int age;

    //Имя метода должно быть с маленькой буквы 
//>>>>>>> 009c671789c938655ea657273f2b5169f78dd726
    public String Show(){
        return this.name + " " + this.age;
    }

    Unit(String name, int age){
    this.name = name;
    this.age = age;
    }
//<<<<<<< HEAD
//=======

    //Нет геттеров
//>>>>>>> 009c671789c938655ea657273f2b5169f78dd726
}
