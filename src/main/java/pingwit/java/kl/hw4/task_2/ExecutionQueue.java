package hw4.task_2;

//+- не хватает ответа на вопрос задания
public class ExecutionQueue {
    private static String msg;

    static {
        msg = "static block";
    }

    {
        msg = "regular init lock";
    }

    public ExecutionQueue() {
        msg = "constructor value";
    }

    public static void main(String[] args) {
        ExecutionQueue executionQueue = new ExecutionQueue();
        System.out.println(executionQueue.msg);
    }

}
