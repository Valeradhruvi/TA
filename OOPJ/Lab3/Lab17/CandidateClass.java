import java.util.Scanner;

public class CandidateClass {
    public static void main(String[] args) {
        Candidate cad1 = new Candidate();
        
        cad1.GetCandidateDetails();
        System.out.println("------------------------------");
        cad1.DisplayAccountDetails();
    }    
}

class Candidate{
    int candidate_ID;
    String candidate_Name;
    int candidate_Age;
    int candidate_Weight;
    int candidate_Height;

    Scanner sc = new Scanner(System.in);
    public void GetCandidateDetails(){

        System.out.println("Enter candidate's Id: ");
        candidate_ID = sc.nextInt();

        System.out.println("Enter candidate's Name: ");
        candidate_Name = sc.next();

        System.out.println("Enter candidate's Age: ");
        candidate_Age = sc.nextInt();

        System.out.println("Enter candidate's Weight: ");
        candidate_Weight = sc.nextInt();

        System.out.println("Enter candidate's Height: ");
        candidate_Height = sc.nextInt();
    }

    public void DisplayAccountDetails(){

        System.out.println("Here's Detail of Candidate: \n");
        System.out.println("Candidate's ID: "+candidate_ID);
        System.out.println("Candidate's Name: "+candidate_Name);
        System.out.println("Candidate's Age: "+candidate_Age);
        System.out.println("Candidate's Weight: "+candidate_Weight);
        System.out.println("Candidate's Height: "+candidate_Height);
    }
    
}