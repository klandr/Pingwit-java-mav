package hw6.task_2_try_variant2;

//+- как тестовый класс может быть, но больше интересует взаимодействие с коробкой через машину
public class GearBoxMain {
    public static void main(String[] args) {
        GearBoxSteer gearBoxSteer = new GearBoxSteer();
        gearBoxSteer.upGear();
        gearBoxSteer.downGear();
    }
}
