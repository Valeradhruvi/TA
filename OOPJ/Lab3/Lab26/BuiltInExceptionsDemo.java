import java.io.*;

public class BuiltInExceptionsDemo {
    public static void main(String[] args) {
        // 1. ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        // 3. NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        // 4. FileNotFoundException (Checked Exception)
        try {
            FileReader file = new FileReader("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
