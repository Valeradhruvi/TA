import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileContent {
    public static void main(String[] args) {
        String ogFile = "file1.txt";
        String copy = "file2.txt";

        try (FileReader reader = new FileReader(ogFile);
             FileWriter writer = new FileWriter(copy)) {

            int ch;
            System.out.println("Content of the source file:");
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
                System.out.print((char) ch);  // use print instead of println for proper formatting
            }

            System.out.println("\nFile copied successfully to " + copy);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
