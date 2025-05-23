import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter Third Number: ");
        int num3 = sc.nextInt();


        if(num1 == num2 && num2 == num3){  
            System.out.println("All three of numbers are equal");
        } 
        else{
            if(Math.max(num1, num2) == num1){
                if(Math.min(num1, num3) == num1){
                    System.out.println("Largest Number: "+num1);
                }
                else{
                    System.out.println("Largest Number: "+num3);
                }
            }
            else{
                if(Math.max(num2, num3) == num2){
                    System.out.println("Largest Number is : "+num2);
                }
                else{
                    System.out.println("Largest number is : " +num3);
                }
           }
        }
    }    
}
