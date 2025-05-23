import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int ogNumber = num;
        int reversed = 0;
        while (num!= 0) {
            int last = num%10;
            reversed = reversed * 10 + last;
            num = num/10;
        }

        System.err.println("Original number: "+ogNumber);
        System.out.println("Reversed number: "+reversed);
    }    
}
