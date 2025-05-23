import java.util.Scanner;

public class AreaUsingMethodOverL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ans1 = area(3.0);
        int ans2 = area(4);
        double ans3 = area(10, 10);

        System.out.println("Area of Square: "+ans2+" , Triangle: "+ans3+" , Circle: "+ans1);
    }
    
    public static double area(double r){
        return 2*Math.PI*r;
    }
    public static int area(int s){
        return s*s;
    }
    public static double area(int b, int h ){
        return 0.5*b*h;
    }
}
