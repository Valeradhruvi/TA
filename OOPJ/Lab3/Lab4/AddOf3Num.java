import java.util.Scanner;

public class AddOf3Num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter 2st number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Enter 3st number: ");
        int num3 = sc.nextInt();

        System.out.println("Sum is: "+(num1+num2+num3));

        // int [] numArray = new int[3];
        // for(int i=0;i<3;i++){
        //     System.out.println("Enter "+i+"th number");
        //     numArray[i] = sc.nextInt();
        // }

        // System.out.println(numArray);
        // int sum = 0;
        // for(int i=0;i<3;i++){
        //     sum += numArray[i];
        // }

        // System.err.println("Addition is : "+sum);
    }
}