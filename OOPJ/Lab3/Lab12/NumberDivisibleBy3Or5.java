import java.util.Scanner;

public class NumberDivisibleBy3Or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Size of Array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the array element at "+i+" index");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3 == 0 || arr[i]%5 == 0){
                sum = sum + arr[i];
            }
        }

        System.out.println("Sum : "+sum);
    }    
}
