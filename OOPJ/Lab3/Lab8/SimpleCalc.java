
import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter 1 for Addition \n Enter 2 for substraction \n Enter 3 for Multiplication \n Enter 4 for Division \n Enter 5 to Exit Application");
        int opr = sc.nextInt();

        switch (opr) {
                case 1:
                    System.out.println("Addition is: "+(num1+num2));
                    break;
                case 2:
                    System.out.println("Substraction is: "+(num1-num2));
                    break;
                case 3:
                    System.out.println("Multiplication is: "+(num1*num2));
                    break;
                case 4:
                    System.out.println("Division is: "+(num1/num2));
                    break;
                case 5:
                    System.out.println("Thank you!!");
                    break;
            
                default:
                    break;
        }
    }
}