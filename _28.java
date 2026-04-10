
// 8. Create a class TextProcessingBuilder.
//  Use StringBuilder to create a string.
//  Append additional text.
//  Display modified string.
//  Write a comment comparing StringBuilder and
// StringBuffer.

// Class: TextProcessingBuilder
public class _8Eight {
    public static void main(String[] args) {

        // Create a StringBuilder object with initial text
        StringBuilder sb = new StringBuilder("Hello");

        // Append additional text
        sb.append(" World!");
        sb.append(" Welcome to Java.");

        // Display the modified string
        System.out.println("Modified String: " + sb.toString());
    }
}

/*
Comparison between StringBuilder and StringBuffer:

1. StringBuilder:
   - Not thread-safe (no synchronization).
   - Faster performance.
   - Used in single-threaded applications.

2. StringBuffer:
   - Thread-safe (synchronized).
   - Slower than StringBuilder.
   - Used in multi-threaded environments where safety is required.
*/