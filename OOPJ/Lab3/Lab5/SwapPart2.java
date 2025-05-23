// package Lab5;

import java.util.Scanner;

public class SwapPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter 2st number: ");
        int num2 = sc.nextInt();

        System.out.println("Before Swapping numbers");
        System.out.println("1st number: "+num1);
        System.out.println("2nd number: "+num2);


        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("After Swapping numbers");
        System.out.println("1st number: "+num1);
        System.out.println("2nd number: "+num2);
    }
}
