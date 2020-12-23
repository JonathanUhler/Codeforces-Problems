import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int t = scanner.nextInt();

            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                int k = 0;
                int zeros = 1;
                String ans = new String("");

                if (n <= 9) {
                    System.out.println(1);
                    System.out.println(n);
                }
                else if (n >= 10) {
                    if (n % 10 == 0) {
                        System.out.println(1);
                        System.out.println(n);
                    }
                    else if (n % 10 != 0) {
                        while (n > 0) {
                            if (n % 10 != 0) {
                                ans = ans + (n % 10) * zeros + " ";
                                k++;
                            }
                            zeros *= 10;
                            n = n / 10;
                        }
                        System.out.println(k);
                        System.out.println(ans);
                    }
                }
            }
        }
    }
}
