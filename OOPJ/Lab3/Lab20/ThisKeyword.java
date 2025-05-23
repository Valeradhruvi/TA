public class ThisKeyword{
    public static void main(String[] args) {
        Student s1 = new Student("John", 18);
        s1.display();
    }
}

class Student {
    static int height = 153;
    String name;
    int age;

    // Constructor with 'this' keyword
    Student(String name, int age) {
        this.name = name;  // 'this' refers to the current object's variable
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: "+this.height); 

        //this keyword can access static variables but with warning
    }
}