import java.util.Scanner;

public class TwoDArrayDemonstration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter Element at "+i+" "+j+" index");
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println("---------------------------------------");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }

            System.err.println();
        }
    }
}
