import java.util.Scanner;

public class BmiCalc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weight = sc.nextInt();

        System.out.println("Enter height in inches: ");
        double height = sc.nextInt();

        double weightInKg = 0.45359237*weight;
        double heightInMeter = 0.0254*height;

        double bmi = weightInKg / heightInMeter*heightInMeter;

        System.out.println("BMI is : "+bmi);
    }
}