// Import the scanner to scan input
import java.util.*;

// Main class
public class Main {

    public static int[] AddToIntArray(int[] oldInt, int newInt) {
        int[] newArray = Arrays.copyOf(oldInt, oldInt.length+1);
        newArray[oldInt.length] = newInt;
        return newArray;
    }

    // main() method --> starting point for the program
    public static void main(String[] args) {
        // Create a new scanner object to check the console input
        Scanner scanner = new Scanner(System.in);

        // While the scanner is able to retrieve data, execute the test cases
        while (scanner.hasNext()) {

            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int[] scores = new int[0];
            for (int i = 0; i < n; i++) {
                scores = AddToIntArray(scores, scanner.nextInt());
            }

            int kthPlace = scores[k - 1];
            int ans = 0;

            for (int i = 0; i < n; i++) {

                if (scores[i] >= kthPlace && scores[i] != 0) {
                    ans++;
                }

            }

            System.out.println(ans);

        }

    }

}
