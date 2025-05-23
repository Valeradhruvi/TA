import java.util.Scanner;

public class InnerClass {
    public static void main(String[] args) {
        
        InnerOne in = new InnerOne();

        in.Display();
        System.out.println("After Inner class Execu");

    }    

    
    public static class InnerOne {
        
        public void Display(){
            System.out.println("This is Inner class");
        }
    }
}
