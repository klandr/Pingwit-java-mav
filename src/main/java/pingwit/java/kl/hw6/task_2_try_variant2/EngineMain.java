package hw6.task_2_try_variant2;

//+- как тестовый класс может быть, но интересует как двигатель будет вести себя в машине
public class EngineMain {
    public static void main(String[] args) {
        EngineSteer engineSteer = new EngineSteer();
        engineSteer.startEngine();
        engineSteer.stopEngine();
    }
}
