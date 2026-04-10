
// 14. File Processing System
// Create a class FileProcessingSystem. Simulate file reading using
// try-catch. Use finally block to display cleanup message.
// Output: &#39;Reading file...&#39; and &#39;Closing file resources&#39;


public class _14Fourteen  {
    public static void main(String[] args) {

        try {
            System.out.println("Reading file...");

            // Simulating an error (optional)
            int x = 10 / 0;  // causes ArithmeticException

        } catch (Exception e) {
            System.out.println("Error occurred while reading file");
        } finally {
            System.out.println("Closing file resources");
        }
    }
}