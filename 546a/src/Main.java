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

            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int w = scanner.nextInt();

            int total = 0;

            for (int i = 1; i < (w + 1); i++) {
                total += k * i;
            }


            if ((total - n) < 0) {
                System.out.println(0);
            }
            else {
                System.out.println(total - n);
            }

        }

    }

}
