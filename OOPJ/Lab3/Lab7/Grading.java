import java.util.Scanner;

public class Grading {
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

        if(percentage >= 90){
            System.err.println("A+ Grade");
        }
        else if(percentage< 90 && percentage >=80){
            System.out.println("A Grade");
        }
        else if(percentage< 80 && percentage >=70){
            System.out.println("B+ Grade");
        }
        else if(percentage< 70 && percentage >=60){
            System.err.println("B Grade");
        }
        else if(percentage< 60 && percentage >=50){
            System.out.println("C Grade");
        }
        else if(percentage< 50 && percentage >=35){
            System.out.println("P Grade");
        }
        else if(percentage < 35){
            System.out.println("Better luck next time");
        }
        else{
            System.out.println("Something is wrong");
        }
    }    
}
