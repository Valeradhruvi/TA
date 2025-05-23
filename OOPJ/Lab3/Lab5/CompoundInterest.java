// package Lab5;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    

        System.out.println("Enter Value of P: ");
        int p = sc.nextInt();
        
        System.out.println("Enter Value of n: ");
        int n = sc.nextInt();
        
        System.out.println("Enter Value of r: ");
        int r = sc.nextInt();
        
        System.out.println("Enter Value of t: ");
        int t = sc.nextInt();

        int pow = n*t;
        double compoundInt = p*(1+(r/100))^(n*t);

        System.out.println("Compound Interest according to data is: "+compoundInt);
    }
}
