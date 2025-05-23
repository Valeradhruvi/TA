import java.lang.ProcessBuilder.Redirect;

public class Vegie{
    public static void main(String[] args) {
        Potato p1 = new Potato();
        Brinjal b1 = new Brinjal();
        Tomato t1 = new Tomato();   

        System.out.println(p1.toString());
        System.out.println(b1.toString());
        System.out.println(t1.toString());
    }
}

abstract class Vegetable{
    abstract public String toString();
}

class Potato extends Vegetable{
    String colour = "Brown";
    String name = "Potato";
    
    public String toString(){
        return "Name: "+this.name+" Colour: "+this.colour;
    }
}

class Brinjal extends Vegetable{
    String colour = "Purple";
    String name = "Brinjal";

    public String toString(){
        return "Name: "+this.name+" Colour: "+this.colour;
    }
}

class Tomato extends Vegetable{
    String colour = "Red";
    String name = "Tomato";

    public String toString(){
        return "Name: "+this.name+" Colour: "+this.colour;
    }
}