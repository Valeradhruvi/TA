import java.util.Scanner;

public class ScoreCard {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. of matches: ");
        int matches = sc.nextInt();

        System.out.println("Enter no. of Players: ");
        int Players = sc.nextInt();

        int [][] scoreBoard = new int[Players][matches];

        for(int i=0;i<Players;i++){
            for(int j=0;j<matches;j++){
                System.out.println("Enter score of player "+(i+1)+" for match "+(j+1)+" :" );
                scoreBoard[i][j] = sc.nextInt();
            }
        }
        System.out.println("********************");

        System.out.println("Here is the ScoreBoard!!");
        for(int i=0;i<Players;i++){
            for(int j=0;j<matches;j++){
                System.out.println("Player "+(i+1)+" ->  Match "+(j+1)+" : "+scoreBoard[i][j]);
            }
        }
    }    
}
