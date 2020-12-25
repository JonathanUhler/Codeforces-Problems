// Import the scanner to scan input
import java.util.*;

// Main class
public class Main {

    // main() method --> starting point for the program
    public static void main(String[] args) {
        // Create a new scanner object to check the console input
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int previous = 0;

        int ans = 0;

        for (int i = 0; i < n; i++) {

            int current = scanner.nextInt();

            if (current != previous) {
                ans++;
            }

            previous = current;
        }

        System.out.println(ans);

    }

}
