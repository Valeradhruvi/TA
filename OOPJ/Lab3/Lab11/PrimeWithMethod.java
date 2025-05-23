import java.util.Scanner;

public class PrimeWithMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        prime(n);
    }   
    
    public static void prime(int n){
        boolean isPrime = true;
        for(int i=2 ; i<=n/2 ; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("It is Prime Number");
        }
        else{
            System.out.println("It is not Prime Number");
        }
    }
}
