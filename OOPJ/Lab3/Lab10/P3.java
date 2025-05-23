public class P3 {
    public static void main(String[] args) {
        char ch = 'a';

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }

            if (i % 2 != 0) { 
                for (int num = 5; num >= 5 - (i - 1); num--) {
                    System.out.print(num);
                }
            } else { 
                for (int j = 0; j < i; j++) {
                    System.out.print(ch);
                }
                ch++; 
            }

            System.out.println();
        }
    }
}
