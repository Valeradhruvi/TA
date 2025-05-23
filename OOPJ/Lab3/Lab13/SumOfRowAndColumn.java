import java.util.Scanner;

public class SumOfRowAndColumn {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int [][] matrix = new int[4][4];


        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.println("Enter Element at "+i+" "+j+" index");
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<4;i++){
            int rowSum = 0;
                for(int j=0;j<4;j++){
                    rowSum = rowSum + matrix[i][j];
                }

            System.out.println("Row " + i + " sum: " + rowSum);
        }

        for(int i=0;i<4;i++){
            int columnSum = 0;
                for(int j=0;j<4;j++){
                    columnSum = columnSum + matrix[j][i];
                }

            System.out.println("Column " + i + " sum: " + columnSum);
        }
    }    
}
