public class MultilevelInheritance {
    public static void main(String[] args) {
        Manager mngr = new Manager();

        mngr.showIdentity();
        mngr.showDepartment();
    }
}

interface Person {
    void showIdentity();
}

class Employee implements Person {
    String name = "User";
    int empId = 101;

    public void showIdentity() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
    }
}

class Manager extends Employee {
    String department = "BCA";

    public void showDepartment() {
        System.out.println("Department: " + department);
    }
}