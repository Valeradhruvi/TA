public class ShapeClass {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape triangle = new Triangle(10, 10);
        Shape Square = new Square(10);

        circle.area();
        triangle.area();
        Square.area();
    }    
}

class Shape{
    public void area(){
        System.out.println("Area method of Shape");
    }
}

class Circle extends Shape{
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public void area(){
        System.out.println("Area of circle: "+(Math.PI*Math.pow(radius, 2)));
    }
}

class Triangle extends Shape{
    int base , height;

    public Triangle(int base , int height){
        this.base = base;
        this.height = height;
    }

    public void area(){
        System.out.println("Area of Triangle: "+(0.5*base*height));
    }
}

class Square extends Shape{
    int side;

    public Square(int side){
        this.side = side;
    }

    public void area(){
        System.out.println("Area of Square: "+(side*side));
    }
}
