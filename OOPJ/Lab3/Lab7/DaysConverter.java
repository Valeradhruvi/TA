
import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int totalDays = scanner.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        System.out.println(totalDays + " days = " + years + " year, " + weeks + " week, and " + days + " day");

    }
}