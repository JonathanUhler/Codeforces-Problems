// Import the scanner to scan input
import java.util.*;

// Main class
public class Main {

    // main() method --> starting point for the program
    public static void main(String[] args) {
        // Create a new scanner object to check the console input
        Scanner scanner = new Scanner(System.in);

        // Solution goes here...
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                System.out.print("I hate ");
            }
            if (i % 2 != 0) {
                System.out.print("I love ");
            }

            if (i + 1 == n){
                System.out.print("it ");
            }
            else {
                System.out.print("that ");
            }

        }

    }

}
