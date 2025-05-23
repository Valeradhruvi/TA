public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.show();
    }    
}

class Parent{

    String msg = "This message is from parent class";

    public Parent(){
        System.out.println("This is parent's constructor");
    }

    public void display(){
        System.out.println("This is parent class's method");
    }
}

class Child extends Parent{

    public Child(){
        super();
        System.out.println("This is child's constructor");
    }

    public void show(){
        System.out.println("Parent's msg: "+super.msg);

        super.display();
    }
}