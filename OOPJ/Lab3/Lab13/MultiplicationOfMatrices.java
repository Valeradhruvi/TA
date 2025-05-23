import java.util.Scanner;

public class MultiplicationOfMatrices {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (n x n): ");
        int n = sc.nextInt();

        int [][] arr1 = new int[n][n];
        int [][] arr2 = new int[n][n];
        int [][] result = new int[n][n];

        System.out.println("For First Matrix: ");
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter Element at "+i+" "+j+" index");
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("For Second Matrix: ");
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter Element at "+i+" "+j+" index");
                arr2[i][j] = sc.nextInt();
            }
        }

         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }


        System.out.println("Resultant Matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(result[i][j]+" ");
            }

            System.err.println();
        }
    }
}
