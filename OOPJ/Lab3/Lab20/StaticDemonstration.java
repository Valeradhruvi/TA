public class StaticDemonstration {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "User");
        stu1.display();
        Student.change();
        stu1.display();
    }

    static{
        System.out.println("Hello from static block");
    }
}


class Student{
    int rollNo;
    String name;
    static String clg = "Darshan University";

    static void change(){
        clg = "DIET";

        //rolln0 = "10" //cannot use nonstatic variables in static method
    }

    Student(int r , String n){
        rollNo = r;
        name = n;
    }

    void display(){
        System.out.println("RollNo: "+rollNo+" Name: "+name+ " Collage: "+clg);
    }
}