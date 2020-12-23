import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int x = 0;
            int numOps = scanner.nextInt();

            for (int i = 0; i < numOps; i++) {
                String str = scanner.next();
                char op = str.charAt(1);

                if (op == '+') {
                    x++;
                }
                else if (op == '-') {
                    x--;
                }
            }
            System.out.println(x);
        }
    }
}
