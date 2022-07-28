package hw6.task_2;

// Интересная затея, но нет. Твой мотор должен иметь состояние вкл-выкл, для этого достаточно одного boolean поля
public class Engine {
    private String stopEngine; 
    private String startEngine;
    public String getStopEngine() {
        System.out.println("print get Stop engine");    //|get  | <- все эти комментарии не улучшают читаемость кода 
        return stopEngine;                              //|     |
    }                                                   //|     |     Stop engine
     public void setStopEngine(String stopEngine) {
        System.out.println("print set Stop engine");    //|set  |
        this.stopEngine = stopEngine;                   //|     |
    }                                                   //|     |
    public String getStartEngine() {
        System.out.println("print get Start engine");   //|get  |
        return startEngine;                             //|     |
    }                                                   //|     |   Start engine
    public void setStartEngine(String startEngine) {
        System.out.println("print set Start engine");   //|set  |
        this.startEngine = startEngine;                 //|     |
    }                                                   //|     |
}

