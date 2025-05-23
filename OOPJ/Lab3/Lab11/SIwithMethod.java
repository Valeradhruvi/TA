import java.util.Scanner;

public class SIwithMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value of o: ");
        int p = sc.nextInt();
        
        System.out.println("Enter Value of r: ");
        int r = sc.nextInt();
        
        System.out.println("Enter Value of t: ");
        int t = sc.nextInt();

        double si = simpleInterenst(p,r,t);
        System.out.println("Simple Interest: "+si);
    }

    public static double simpleInterenst(int p , int r , int t){
        return (p*r*t)/100;
    }
}

