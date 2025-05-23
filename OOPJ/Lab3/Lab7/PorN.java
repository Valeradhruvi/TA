import java.util.Scanner;

public class PorN {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Number: ");
    int n = sc.nextInt();

    if(n>0){
        System.out.println("Number is Positive");
    }
    else{
        System.out.println("Number is Negetive");
    }
 }    
}
