import java.util.Scanner;

public class ArrayDemonstration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the array element at "+i+" index");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Array Elements");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
