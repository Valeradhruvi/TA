import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an number: ");
        int num = sc.nextInt();

        try{
            if(num < 0){
                throw new Exception("Number is Negetive");
            }
            else{
                System.out.println("Input Accepted!!!");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }    
}
