import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String ch = sc.nextLine();

        if(ch.equalsIgnoreCase("A")|| ch.equalsIgnoreCase("E") || ch.equalsIgnoreCase("I") || ch.equalsIgnoreCase("O") || ch.equalsIgnoreCase("U")){
            System.out.println("It is Vowel");
        }
        else{
            System.out.println("It is Consonent");
        }
    }    
}
