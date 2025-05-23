import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int length = 0;
        int og = num;

        int temp = num;

        //for length
        while (temp!=0) {
            temp = temp/10;
            length++;
        }

        double sum = 0;
        while (num!=0) {
            int last = num%10;
            sum = sum + Math.pow(last, length);
            num = num/10;
        }

        // System.out.println(sum);
        if(sum == og){
            System.out.println("It is Armstrong Number.");
        }
        else{
            System.out.println("It is not Armstrong Number.");
        }
    }    
}
