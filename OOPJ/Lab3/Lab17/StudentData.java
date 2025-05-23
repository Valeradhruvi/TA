public class StudentData {
    public static void main(String[] args) {
        Student s1 = new Student(230102011, "User1", "Female", 225);
        Student s2 = new Student(230102012, "User2", "Male", 220);

        s1.display();
        System.out.println("----------------------");
        s2.display();
    }    
}

class Student{
    int enrollNo;
    String name;
    String gender;
    int marks;

        Student(int enrollNo , String name , String gender , int marks){
            this.enrollNo = enrollNo;
            this.name = name;
            this.gender = gender;
            this.marks = marks;
        }

        public void display(){
            System.out.println("Enrollment Number: "+enrollNo);
            System.out.println("Name: "+name);
            System.out.println("Gender: "+gender);
            System.out.println("Marks: "+marks);
        }
}