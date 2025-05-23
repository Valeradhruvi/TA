import java.util.Scanner;

public class PercentageAndTotal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 1st subject: ");
        int m1 = sc.nextInt();

        System.out.println("Enter marks of 2nd subject: ");
        int m2 = sc.nextInt();

        System.out.println("Enter marks of 3rd subject: ");
        int m3 = sc.nextInt();

        System.out.println("Enter marks of 4th subject: ");
        int m4 = sc.nextInt();

        System.out.println("Enter marks of 5th subject: ");
        int m5 = sc.nextInt();

        double total = m1+m2+m3+m4+m5;
        double percentage = (total/500)*100;

        System.out.println("Total marks: "+total);
        System.out.println("Percenrage: "+percentage);
        
    }
}