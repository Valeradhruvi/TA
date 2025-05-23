public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();                      // Default constructor
        Rectangle r2 = new Rectangle(5, 3);              // Parameterized constructor
        Rectangle r3 = new Rectangle(r2); 
        
        System.out.println("Displaying area: ");
        r1.getArea();
        r2.getArea();
        r3.getArea();

        System.out.println("Total obj created: "+Rectangle.count);
        
    }
}

class Rectangle{
    int length;
    int breadth;
    static int count = 0;

    public Rectangle(){
        length = 0;
        breadth = 0;
        count++;

        System.out.println("This is Default constructor.");
    }

    public Rectangle(int length , int breadth){
        this.length = length;
        this.breadth = breadth;

        count++;
        System.out.println("This is Parameterised constructor");
    }

    public Rectangle(Rectangle r){
        this.length = r.length;
        this.breadth = r.breadth;

        count++;
        System.out.println("This is copy constructor");
    }

    public void getArea(){
        System.out.println("Area: "+(this.length*this.breadth));
    }

    public void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth);
    }

    //static block
    static {
        count = 0;
        System.out.println("Static initializer block called. Count initialized.");
    }
    {
        System.out.println("Initializer block");
        //it will be executed when an object will be created
    }

    public static int getCount() {
        return count;
    }
}