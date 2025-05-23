import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.next();

        String reversed = "";
        
        for(int i=str.length()-1;i>=0;i--){
            reversed = reversed+str.charAt(i);
        }

        // System.out.println(reversed);

        if(reversed.equals(str)){
            System.out.println("It is Plaindrome String");
        }
        else{
            System.out.println("It is not Palindrome String");
        }
    }    
}
