package hw6.task_2_try_variant2;

//+- не хватает хранения состояния - включен ли двигатель. Сейчас выводятся сообщения, но состояние двигателя не меняется 
public class EngineSteer implements Engine {


    @Override
    public void startEngine() {
        System.out.println("Engine Started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine Stopped");
    }
}
