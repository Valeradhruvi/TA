import java.util.Scanner;

public class FactorialWithRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int fac = factorial(n);
        System.out.println("Factorial: "+fac);
    }   
    
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
