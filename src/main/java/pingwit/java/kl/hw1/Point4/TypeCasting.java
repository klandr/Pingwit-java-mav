package hw1.Point4;

public class TypeCasting {
    public static void main(String[] args) {
        byte myByte = (byte) 1000;// -128 - 127 --> 256
        System.out.println(myByte);

        int myInteger = myByte;
        System.out.println(myInteger);

        char myChar = 'a';
        myInteger = myChar;
        System.out.println("~ " + myInteger + " ~");
        char myCharacter = 97 ;
        System.out.println(" ___");                     //
        System.out.println("| "+ myCharacter  + " |");  //  :)
        System.out.println(" ===");                     //

    }
}
