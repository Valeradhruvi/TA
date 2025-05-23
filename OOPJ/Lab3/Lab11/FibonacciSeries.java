import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        fibonacciSeries(8);
    }   
    
    public static void fibonacciSeries(int n){
        int n1 = 0 , n2 = 1;

        for(int i=0 ; i<=n ; i++){
          System.out.print(n1 + " ");
          int next = n1+n2;
          n1 = n2;
          n2 = next;
        }
    }
}
