import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int ans = 0;

            for (int i = 0; i < n; i++) {
                int Petya = scanner.nextInt();
                int Vasya = scanner.nextInt();
                int Tonya = scanner.nextInt();

                int votes = Petya + Vasya + Tonya;

                if (votes >= 2) {
                    ans += 1;
                }
            }
            System.out.println(ans);
        }
    }
}
