import java.util.Scanner;

public class DivisibleBy2Not3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lower range: ");
        int lr = sc.nextInt();

        System.out.println("Enter Upper Range: ");
        int ur = sc.nextInt();

        for(int i=lr ; i<=ur ; i++){
            if(i%2 == 0 && i%3 != 0){
                System.out.println(i);
            }
        }
    }    
}
