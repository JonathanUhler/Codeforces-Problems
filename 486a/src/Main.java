// Import the scanner to scan input
import java.util.*;

// Main class
public class Main {

    // main() method --> starting point for the program
    public static void main(String[] args) {
        // Create a new scanner object to check the console input
        Scanner scanner = new Scanner(System.in);

        // Solution goes here...
        long n = scanner.nextLong();
        long ans = 0;

        if (n % 2 == 0) {
            ans = (long) n / 2;
        }
        else {
            ans = -1 * (long) (n + 1) / 2;
        }

        System.out.println(ans);

    }

}
