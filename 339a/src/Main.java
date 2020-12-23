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

            String nums = scanner.next();
            String[] splitted = nums.split("\\+");

            Arrays.sort(splitted);

            System.out.println(String.join("+", splitted));

        }

    }

}
