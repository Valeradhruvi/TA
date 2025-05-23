import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount();

        acc1.getAccountDetails();
        System.out.println("-----------------------");
        acc1.displayAccountDetails();
    }
}

class BankAccount{
    int account_no;
    String user_Name;
    String email;
    String account_type;
    int account_Balance;

    Scanner sc = new Scanner(System.in);
    public void getAccountDetails(){
        System.out.println("Please Enter Account Number: ");
        account_no = sc.nextInt();

        System.out.println("Please Enter User Name: ");
        user_Name = sc.next();

        System.out.println("Please Enter your Email: ");
        email = sc.next();

        System.out.println("Please Enter your Account Type: ");
        account_type = sc.next();

        System.out.println("Please Enter Account Balance: ");
        account_Balance = sc.nextInt();
    }

    public void displayAccountDetails(){

        System.out.println("Here's Detail of your Account: \n");
        System.out.println("Account ID: "+account_no);
        System.out.println("Account holder's Name: "+user_Name);
        System.out.println("Account holder's Email: "+email);
        System.out.println("Account's Type: "+account_type);
        System.out.println("Account's Balance: "+account_Balance);
    }
}