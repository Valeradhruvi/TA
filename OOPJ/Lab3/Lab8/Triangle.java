import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three sides of Triangle: ");
        System.out.println("Enter 1st side: ");
        int s1 = sc.nextInt();

        System.out.println("Enter 2nd side: ");
        int s2 = sc.nextInt();
        
        System.out.println("Enter 3rd side: ");
        int s3 = sc.nextInt();

        if(s1 == s2 && s2 == s3 && s3 == s1){
            System.out.println("It is Equilateral Triangle");
        }   
        else if(s1 == s2 || s2 == s3 || s3 == s1){
            System.out.println("It is Isosceles Triangle");
        }
        else if(
            s1 * s1 + s2 * s2 == s3 * s3 ||
            s2 * s2 + s3 * s3 == s1 * s1 ||
            s3 * s3 + s1 * s1 == s2 * s2 
        ){
            System.out.println("It is Right-angled Triangle");
        }

        else{
            System.out.println("It is scalen Triangle");
        }
    }
}