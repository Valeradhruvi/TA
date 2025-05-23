import java.lang.Math;

public class DemonstrateMathModule {
    public static void main(String[] args) {
        
        int num1 = 2;
        int num2 = 3;

        System.out.println("Mininmum of two: "+Math.min(num1, num2));
        System.out.println("Maximum of two: "+Math.max(num1, num2));
        System.out.println("Random Number: "+Math.random());
        System.out.println("Power of number: "+Math.pow(num1, num2));
        System.out.println("Square Root: "+Math.sqrt(4));
        System.out.println("Round of of number: "+Math.round(4.44));
        System.out.println("Ceiling Number: "+Math.cbrt(3.4));
        System.out.println("Floor Number: "+Math.floor(3.4));
        System.out.println("Abstract number: "+Math.abs(-3));
    }    
}
