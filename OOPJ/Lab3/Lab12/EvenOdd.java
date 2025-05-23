import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the array element at "+i+" index");
            arr[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.println("Even: "+even+" Odd: "+odd);
    }    
}
