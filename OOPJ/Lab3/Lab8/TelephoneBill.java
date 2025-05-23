import java.util.Scanner;

public class TelephoneBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter Number of calls: ");
        int calls = sc.nextInt();
        
        double rs;

        if(calls >= 100){
            rs = 200;
        }
        else if(calls <= 150){
            rs = 200 + (calls - 100) * 0.60;  
        }
        else if(calls <= 200){
            rs = 200 + (50 * 0.60) + (calls - 150) * 0.50;
        }
        else{
            rs = 200 + (50 * 0.60) + (50 * 0.50) + (calls - 200) * 0.40;
        }

        System.out.println("Your monthly telephone bill is: " + rs);
    }
}
