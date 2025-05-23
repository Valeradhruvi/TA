import java.util.Scanner;

public class EmployeeOpr {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee();

        emp1.getEmployeeDetails();
        System.out.println("--------------------------");
        emp1.displayEmployeeDetails();
    }    
}

class Employee{
    int employeeID;
    String employeeName;
    String designation;
    int age;
    int salary;

    Scanner sc = new Scanner(System.in);
    public void getEmployeeDetails(){
        System.out.println("Please Enter Employee Id: ");
        employeeID = sc.nextInt();

        System.out.println("Please Enter Employee Name: ");
        employeeName = sc.next();

        System.out.println("Please Enter Designation of Employee: ");
        designation = sc.next();

        System.out.println("Please Enter Age: ");
        age = sc.nextInt();
        
        System.out.println("Please Enter Salary: ");
        salary = sc.nextInt();
    }

    public void displayEmployeeDetails(){

        System.out.println("Here's Detail of Employee: \n");
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Employee's Name: "+employeeName);
        System.out.println("Designation of Employee: "+designation);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}