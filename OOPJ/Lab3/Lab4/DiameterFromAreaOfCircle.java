import java.util.Scanner;

public class DiameterFromAreaOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Area of Circle: ");
        double area = sc.nextInt();

        double radius = area / (2*Math.PI);
        System.out.println("Diameter is : " +radius*2);
    }
}