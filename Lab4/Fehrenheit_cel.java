import java.util.Scanner;
public class Fehrenheit_cel{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter temperature in fehrenheit: ");
        double feh = sc.nextDouble();
        if(feh < 0 || feh == 0){
            System.out.println("enter valid Temperature");
        }
        else{
        double cel = ((feh-32)*5/9.0);
        System.out.println("Temperature in Celcius: "+cel);
        }
    }
} 