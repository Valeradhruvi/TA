package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        B b1 = new B();
        C c1 = new C();

        b1.display();
        System.out.println("-------------------");
        c1.display();
    }    
}
