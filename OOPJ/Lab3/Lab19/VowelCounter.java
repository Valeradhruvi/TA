import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;

        while (true) {
            System.out.print("Enter a sentence (or type 'quit' to stop): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = Character.toLowerCase(input.charAt(i));
                switch (ch) {
                    case 'a': countA++; 
                            break;
                    case 'e': countE++; 
                            break;
                    case 'i': countI++; 
                            break;
                    case 'o': countO++; 
                            break;
                    case 'u': countU++; 
                            break;
                }
            }

            totalA += countA;
            totalE += countE;
            totalI += countI;
            totalO += countO;
            totalU += countU;

            // vowel counts for this sentence
            System.out.println("Vowel counts in this sentence:");
            System.out.println("a: " + countA);
            System.out.println("e: " + countE);
            System.out.println("i: " + countI);
            System.out.println("o: " + countO);
            System.out.println("u: " + countU);
        }


        System.out.println("\nTotal vowel counts for all sentences:");
        System.out.println("a: " + totalA);
        System.out.println("e: " + totalE);
        System.out.println("i: " + totalI);
        System.out.println("o: " + totalO);
        System.out.println("u: " + totalU);

    }
}
