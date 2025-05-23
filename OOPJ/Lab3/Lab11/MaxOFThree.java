import java.util.Scanner;

public class MaxOFThree {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        int largest = maxOfThree(a, b, c);
        System.out.println("largest number : "+largest);
    }    

    public static int maxOfThree(int a , int b , int c){
        int largest = 0;
            if (a > b) {
                if (a > c) {
                    largest = a;
                } else {
                    largest = c;
                }
        } 
        else {
                if (b > c) {
                    largest = b;
                } else {
                    largest = c;
                }
        }
        return largest;
    }
}
