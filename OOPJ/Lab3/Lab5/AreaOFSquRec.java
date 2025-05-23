// package Lab5;
import java.util.Scanner;
public class AreaOFSquRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side of Square");
        int sque = sc.nextInt();

        int areaOFSquare = sque*sque;
        int perimeterOfSquare = 4*sque;
        System.out.println("Area of Square : "+areaOFSquare);
        System.out.println("Perimeter of Square: "+perimeterOfSquare);

        System.out.println("Enter length of Rectangle");
        int length = sc.nextInt();
        System.out.println("Enter width of Rectangle");
        int width = sc.nextInt();

        int areaOFRectangle = length*width;
        int perimeterOfRectangle = 2*(length+width);

        System.out.println("Area of Rectangle : "+areaOFRectangle);
        System.out.println("Perimeter of Rectangle: "+perimeterOfRectangle);
    }    
}
