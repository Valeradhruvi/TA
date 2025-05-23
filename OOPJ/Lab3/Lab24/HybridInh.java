public class HybridInh {
     public static void main(String[] args) {
        C obj = new C();

        // Accessing all methods from class and interfaces
        obj.methodA(); // From class A
        obj.methodB(); // From class B
        obj.methodC(); // From class C
        obj.methodX(); // From interface X
        obj.methodY(); // From interface Y
    }
}
interface X {
    void methodX();
}

interface Y {
    void methodY();
}

class A {
    void methodA() {
        System.out.println("Method from class A");
    }
}

// (single inheritance)
class B extends A {
    void methodB() {
        System.out.println("Method from class B");
    }
}

// (hybrid inheritance)
class C extends B implements X, Y {
    public void methodX() {
        System.out.println("Method from interface X");
    }

    public void methodY() {
        System.out.println("Method from interface Y");
    }

    void methodC() {
        System.out.println("Method from class C");
    }
}