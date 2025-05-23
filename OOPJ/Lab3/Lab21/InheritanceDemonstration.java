public class InheritanceDemonstration {
    public static void main(String[] args) {
        // Shape s1 = new Shape();
        // s1.display();

        // Square sq1 = new Square();
        // sq1.display();

        // Car c1 = new Car();
        // c1.display();

        // SportsCar sp1 = new SportsCar();
        // sp1.display();

        // ElectricCar ec1 = new ElectricCar();
        // ec1.display();

        // Vehical v = new Vehical();
        // v.display(); 

        // Bike b = new Bike();
        // b.display(); 

        // Ktm k = new Ktm();
        // k.display(); 
        
        // Vehical v2 = new Ktm();
        // v2.display();
    }    
}

// <editor-fold desc="Single Inheritence">
    // class Shape{
        
    //     public void display(){
    //         System.out.println("This is Parent class");
    //     }
    // }

    // class Square extends Shape{

    //     public void display(){
    //         System.out.println("This is Child class");
    //     }
    // }
// </editor-fold>

// <editor-fold desc="Hirarchical Inheritance">

// class Car {
//     public void display(){
//         System.out.println("This is parent class");
//     }
// }

// class SportsCar extends Car{
//     public void display(){
//         System.out.println("This is child class of Car");
//     }
// }

// class ElectricCar extends Car{
//     public void display(){
//         System.out.println("This is another child class of Car");
//     }
// }
// </editor-fold>


// <editor-fold desc="Multilevel Inheritance">
// class Vehical{
//     public void display(){
//         System.out.println("This is Parent class Vehical");
//     }
// }

// class Bike extends Vehical{
//     public void display(){
//         System.out.println("This is child class Bike");
//     }
// }

// class Ktm extends Bike{
//     public void  display(){
//         System.out.println("This is child class of Bike KTM");
//     }
// }
// </editor-fold>