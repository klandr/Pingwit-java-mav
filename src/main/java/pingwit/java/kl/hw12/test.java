package hw12;

import java.util.function.Supplier;

public class test {
    public static void main(String[] args) {
        Supplier<Lynx> lynxSupplier = Lynx ::new;
        Lynx lynx=lynxSupplier.get();
            }
}
class Lynx {
    public Lynx(){
        System.out.println("mdfhjkdf");
    }
}