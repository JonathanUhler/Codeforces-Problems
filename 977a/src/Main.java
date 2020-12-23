import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int ans = n;

            for (int i = 0; i < k; i++) {
                if (ans % 10 == 0) {
                    ans = ans/10;
                }
                else if (ans % 10 != 0) {
                    ans -= 1;
                }
            }
            System.out.println(ans);
        }
    }
}
