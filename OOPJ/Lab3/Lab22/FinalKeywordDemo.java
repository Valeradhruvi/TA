public class FinalKeywordDemo {
    public static void main(String[] args) {
       Child c1= new Child();
       c1.display();
    }  
    
    
    final int num = 100;
    public static void run(){
        num = 150; //not allowed 
                  // final variables cannot be modified
    }

}

final class Parent{
    final public void display(){
        System.out.println("Parent class's method");
    }
}

//also final class cannot be extended
class Child extends Parent{
    public void display(){
        System.out.println("Child class's method");

        //final method cannot be overriden
    }
}