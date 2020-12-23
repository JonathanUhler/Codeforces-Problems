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

            String word = scanner.next();

            int upper = 0;
            int lower = 0;

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch >= 'A' && ch <= 'Z')
                    upper++;
                else if (ch >= 'a' && ch <= 'z')
                    lower++;
            }


            if (upper > lower) {
                System.out.println(word.toUpperCase());
            }
            else if (lower > upper || upper == lower) {
                System.out.println(word.toLowerCase());
            }

        }

    }

}
