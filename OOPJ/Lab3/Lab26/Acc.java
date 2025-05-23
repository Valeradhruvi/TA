public class Acc {
   public static void main(String[] args) {
    Account acc1= new Account(10000);
    acc1.deposit(10000);
        try{
            acc1.withdraw(5000);
        }
        catch (InvalidBalance e){
            e.getMessage();
        }
   }
}

class Account{
    int balance;

    public Account(int balance){
        this.balance = balance;
    }

    public void deposit(int amt){
        balance = balance + amt;
        System.out.println("Updated Bank Balance: "+balance);
    }
    
    public void withdraw(int amt) throws InvalidBalance{
        if(amt > balance){
            throw new InvalidBalance("Enter valid amount"); 
        }
        else{
            balance = balance - amt;
            System.out.println("Updated Balance: "+balance);
        }
    }

    // or 
    // public void withdraw(int amt){
    //     if(amt > balance ){
    //         throw new Exception("Enter valid amount");
    //     }
    // }
}

class InvalidBalance extends Exception{
    public InvalidBalance(String msg){
        super(msg);
    }
}