package hw6.task_2;

//- для хранения состояния коробки достаточно одной переменной с числом - текущая передача
public class Gearbox {
    private String gearUp;
    private String gearLow;
    public String getGearUp() {
        System.out.println("print get Gear Up");
        return gearUp;
    }
    public void setGearUp() {
        System.out.println("print set Gear Up");
        this.gearUp = gearUp;
    }
    public String getGearLow() {
        System.out.println("print get Gear Low");
        return gearLow;
    }
    public void setGearLow() {
        System.out.println("print set Gear Low");
        this.gearLow = gearLow;
    }
}
