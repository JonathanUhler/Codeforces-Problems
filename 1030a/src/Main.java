// Import the scanner to scan input
import java.util.*;

// Main class
public class Main {

    // main() method --> starting point for the program
    public static void main(String[] args) {
        // Create a new scanner object to check the console input
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            int opinion = scanner.nextInt();

            if (opinion == 1) {
                System.out.println("HARD");
                break;
            }
            else if (i == (n - 1) && opinion == 0) {
                System.out.println("EASY");
                break;
            }

        }

    }

}
