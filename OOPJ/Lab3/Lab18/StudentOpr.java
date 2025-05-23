import java.util.Scanner;

public class StudentOpr {
    public static void main(String[] args) {
        
        Student stu1 = new Student();

        stu1.getStudentDetails();
        System.out.println("---------------------------");
        stu1.displayStudentDetails();
    }    
}

class Student{
    int enrollmentNo;
    String studentName;
    int semester;
    float spi;
    float cpi;

    Scanner sc = new Scanner(System.in);
    public void getStudentDetails(){
        System.out.println("Please Enter EnrollMent Number: ");
        enrollmentNo = sc.nextInt();

        System.out.println("Please Enter  Student' Name: ");
        studentName = sc.next();

        System.out.println("Please Enter Student' Semester: ");
        semester = sc.nextInt();
        
        System.out.println("Please Enter  Student' SPI: ");
        spi = sc.nextFloat();
        
        System.out.println("Please Enter  Student' CPI: ");
        cpi = sc.nextFloat();
    }

    public void displayStudentDetails(){

        System.out.println("Here's Detail of Employee: \n");
        System.out.println("Student's Enrollment Number: "+enrollmentNo);
        System.out.println("Student's Name: "+studentName);
        System.out.println("Semester: "+semester);
        System.out.println("SPI: "+spi);
        System.out.println("CPI: "+cpi);
    }
}