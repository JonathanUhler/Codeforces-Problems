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

            int y = scanner.nextInt();

            for (int i = y; i < 9000; i++) {

                String year = String.valueOf(i);
                char[] yearDigits = year.toCharArray();
                Arrays.sort(yearDigits);

                int previous = 0;
                int allUnique = 0;

                for (int j = 0; j < yearDigits.length; j++) {

                    int newCompare = yearDigits[j];

                    if (newCompare == previous) {
                        allUnique = 0;
                        break;
                    }
                    else {
                        allUnique = 1;
                        continue;
                    }

                }

                if (allUnique == 1) {
                    System.out.println(i);
                }

            }

        }

    }

}
