package hw8.task_3;

//+- Название класса с большой буквы. Имя может быть IncoppertArraySizeException. Исключение не используется в main
public class mineExeption extends Exception{
    private String checkNumber;

    public mineExeption(String message, String checkNumber) {
        super(message);
        this.checkNumber = checkNumber;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    @Override
    public String toString() {
        return "mineExeption{'message = '" + this.getMessage()+
                "checkNumber=" + checkNumber +
                '}';
    }
}
