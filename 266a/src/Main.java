// Import the scanner to scan input
import java.util.*;

// Main class
public class Main {

    // main() method --> starting point for the program
    public static void main(String[] args) {
        // Create a new scanner object to check the console input
        Scanner scanner = new Scanner(System.in);

        // While the scanner is able to retrieve data, execute the test cases

        // Get the length of the stone line
        int n = scanner.nextInt();
        // Get the list of colors
        String colors = scanner.next();

        int removed = 0;

        // For each of the stones, if it has the same color as the one before it, then remove it
        for (int i = 1; i < n; i++) {
            if (colors.charAt(i - 1) == colors.charAt(i)) {
                removed++;
            }
        }

        // Print the number of removed stones
        System.out.println(removed);

    }

}
