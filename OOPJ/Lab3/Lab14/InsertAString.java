import java.util.Scanner;

public class InsertAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String og = sc.next();

        System.out.println("Enter String you want to insert: ");
        String ins =  sc.next();

        System.out.println("And enter position at which you want to Insert(from 0): ");
        int position = sc.nextInt();

        String newString = og.substring(0,position) + ins + og.substring(position);
        System.out.println("New String: "+newString);
    }    
}
