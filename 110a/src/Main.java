// Import the scanner to scan input
import java.util.*;

// Main class
public class Main {

    // main() method --> starting point for the program
    public static void main(String[] args) {
        // Create a new scanner object to check the console input
        Scanner scanner = new Scanner(System.in);

        // While the scanner is able to retrieve data, execute the test cases
        while (scanner.hasNext()) {

            long num = scanner.nextLong();
            int ans = 0;

            while (num > 0) {
                if (num % 10 == 7 || num % 10 == 4) {
                    ans++;
                }
                num /= 10;
            }

            System.out.println(ans == 4 || ans == 7 ? "YES" : "NO");

        }

    }

}
