import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the array element at "+i+" index");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Element to search: ");
        int ele = sc.nextInt();

        int index = 0;
    
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ele){
                index = i;
                break;
            }
        }

        if(index != 0){
            System.out.println("Element found at "+index+" index");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
