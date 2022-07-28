package hw1.Point3;

//test
public class DataTypes {
    public static void main(String[] args) {
        byte myByte = 1; // -128 - 127 (1byte)
        System.out.print(myByte + "|");
        short myShort = 5; // -2^15 - 2^15 (2byte)
        System.out.print(myShort + "|");
        int myInt = 1000; // 4byte
        System.out.print(myInt + "|");
        long myLong = 10000000000l; //8bytes
        System.out.println(myLong + "|");
// komentar dla proby zapysu
        char myChar = 66; //0-2^16 - 1 (2 byte)
        System.out.println(myChar);
        char myCharactier = 'B';
        System.out.println(myCharactier);

        double myDouble = 0.3; //8 byte
                System.out.println(myDouble);
                int s = (int) myDouble; // trunc
                System.out.println(s);

        float myFloat = 0.3f; //4 byte
        System.out.println(myFloat);



        boolean myBoolean = false;



    }
}
