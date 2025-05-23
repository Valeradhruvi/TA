public class MemberManagement {
    public static void main(String[] args) {
        Employee emp1 = new Employee("emp1", 23, 1234567, "asdf asdf asdf", 10000 , "Hacking");
        Manager man1 = new Manager("Man1", 40, 348875699, "fdsa fdsa fdsa", 10000, "Humanities");

        emp1.printDetails();
        System.out.println("-------------------------------");
        man1.printDetails();
    }    
}

class Member{
    String name;
    int age;
    int phoneNumber;
    String address;
    int salary;

    public Member(String name , int age , int phoneNumber , String address , int salary){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary(){
        System.out.println("Salary: "+salary);
    }
}

class Employee extends Member{
    String specification;

    public Employee(String name , int age , int phoneNumber , String address , int salary , String specification){
        super(name, age, phoneNumber, address, salary);
        this.specification = specification;
    }

    public void printDetails(){
        System.out.println("Here's Detail of Employee \n");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Address: "+address);
        System.out.println("Salary: "+salary);
        System.out.println("Specifications: "+specification);
    }
}

class Manager extends Member{
    String department;

    public Manager(String name , int age , int phoneNumber , String address , int salary , String department){
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    public void printDetails(){
        System.out.println("Here's Detail of Manager \n");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Address: "+address);
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+department);
    }
}