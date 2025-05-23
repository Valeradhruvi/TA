import java.util.Scanner;

public class InterestManagement {
    public static void main(String[] args) {
        Interest i1 = new Interest();

        i1.getAccountDetails();
        i1.calculateInterest();
    }    
}

class AccountDetails{
    String name;
    int accNumber;
    int p;
    int r;
    int t;

    Scanner sc = new Scanner(System.in);
    public void getAccountDetails(){    
        System.out.println("Enter Name of Account Holder: ");
        name = sc.next();

        System.out.println("Enter Account Number: ");
        accNumber = sc.nextInt();

        System.out.println("Enter Principle Amount: ");
        p = sc.nextInt();

        System.out.println("Enter Interest Rate: ");
        r = sc.nextInt();

        System.out.println("Enter Time Period: ");
        t =  sc.nextInt();
    }
}

class Interest extends AccountDetails{

    public void calculateInterest(){
        double interest = (p*r*t)/100;

        System.out.println("Account Holder's nane: "+name);
        System.out.println("AccountNumber: "+accNumber);
        System.out.println("Priciple Amount: "+p);
        System.out.println("Interest rate: "+r+"%");
        System.out.println("Time period: "+t+" yrs");
        System.out.println("Interest: "+interest);
        System.out.println("Total Amount: "+(p+interest));
    }
}