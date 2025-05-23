public class ComplexDemo {
    public static void main(String[] args) {
        // Creating Complex objects using overloaded constructors
        Complex c1 = new Complex(3, 4);      // 3 + 4i
        Complex c2 = new Complex(5);         // 5 + 0i
        Complex c3 = new Complex();          // 0 + 0i

        c1.add(c2);
        
        System.out.println(c1.real + " + " + c1.imaginary + "i");
    }
}

class Complex {
    double real;
    double imaginary;


    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(Complex other) {
         this.real = this.real + other.real;
         this.imaginary = this.imaginary + other.imaginary;
        
    }
}
