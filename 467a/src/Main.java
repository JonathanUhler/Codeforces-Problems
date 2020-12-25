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

            int n = scanner.nextInt();

            int ans = 0;

            for (int i = 0; i < n; i++) {

                int p = scanner.nextInt();
                int q = scanner.nextInt();

                if (p <= (q - 2)) {
                    ans++;
                }

            }

            System.out.println(ans);

        }

    }

}
