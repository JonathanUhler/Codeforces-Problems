// Import the scanner to scan input
import java.util.*;

// Main class
public class Main {

    // main() method --> starting point for the program
    public static void main(String[] args) {
        // Create a new scanner object to check the console input
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        System.out.println((int)Math.ceil(distance / 5.0));

    }

}
