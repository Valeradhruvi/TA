import java.util.Scanner;

public class MeterToFeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter meters: ");
        double meter = sc.nextFloat();

        double feet = 3.28084*meter;

        System.out.println("Feet : "+feet);
   }
}
