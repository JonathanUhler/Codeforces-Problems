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
            String outcomes = scanner.next();

            int a = 0, d = 0;

            for (int i = 0; i < n; i++) {

                if (outcomes.charAt(i) == 'A') {
                    a++;
                }
                else if (outcomes.charAt(i) == 'D') {
                    d++;
                }

            }

            if (a > d) {
                System.out.println("Anton");
            }
            else if (d > a) {
                System.out.println("Danik");
            }
            else {
                System.out.println("Friendship");
            }

        }

    }

}
