public class P1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 0; j < 5-i ; j++) {
                System.out.print(" "); 
            }
            for(int k = 0; k <2 * i - 1; k++) {
                if(i % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print("@");
                }
            }
            System.out.println();
        }
    }
}
