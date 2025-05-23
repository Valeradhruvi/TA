import java.util.Scanner;

public class SetAndGetCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.println("Enter the character you of which you want index: ");
        char ch = sc.next().charAt(0);

        System.out.println("Index: "+str.indexOf(ch));
        
    }
}