import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int t = scanner.nextInt();

            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                int k = scanner.nextInt();

                generatePermutations(n, k);
            }
        }
    }

    public static char[] generatePermutations(int n, int k) {
        String string = new String(new char[n]).replace("\u0000", "a");
        char[] c = string.toCharArray();

        int x;

        for (int j = n - 2; j >= 0; j--) {
            if (k <= (n - j - 1)) {
                c[j] = 'b';
                c[n - k] = c[j];
                System.out.println(c);
                break;
            }

            x = n - j - 1;
            k = k - x;
        }
        return c;
    }
}