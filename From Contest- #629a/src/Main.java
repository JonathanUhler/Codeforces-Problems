import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int t = scanner.nextInt();

            for (int i = 0; i < t; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                if (a % b == 0) {
                    System.out.println(0);
                }
                else {
                    System.out.println(b - (a % b));
                }
            }
        }
    }
}
