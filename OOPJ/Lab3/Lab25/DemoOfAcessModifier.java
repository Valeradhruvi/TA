public class DemoOfAcessModifier {
    public static void main(String[] args) {
        B b1 = new B();
      
        b1.display();
        
    }    
}

class A{
    private int n1 = 10;
    public int n2 = 20;
    protected int n3 = 30;

    public void display(){
        System.out.println("N1: "+n1);
        System.out.println("N2: "+n2);
        System.out.println("N3: "+n3);
    }
}

class B extends A{
    
    public void display(){
        // System.out.println("N1: "+super.n1);
        //this is not allowed because we cannot access private member to even in subclass
        System.out.println("N3: "+n3);
        //we can access protected variable even in subclass but not out of it

        System.out.println("N2: "+n2);
        //this is public vaiable which is accessible everywhere
    }
}