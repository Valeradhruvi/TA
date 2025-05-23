public class P2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++) {
            for(int j = 0; j < 6-i ; j++) {
                System.out.print(" "); 
            }
            for(int k = 0; k < 2 * i - 1; k++) {
                if(k % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }    
}
