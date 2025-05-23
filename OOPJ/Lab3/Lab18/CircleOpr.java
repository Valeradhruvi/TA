public class CircleOpr {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);

        System.out.println("Area: "+c1.area());
        System.out.println("Perimeter: "+c1.perimeter());
    }    
}

class Circle{
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double perimeter(){
        return 2*Math.PI*this.radius;
    }

    public double area(){
        return Math.PI*Math.pow(radius, 2);
    }
}