import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int t = scanner.nextInt();

            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();

                char[] x = scanner.next().toCharArray();
                char[] a = new char[n];
                char[] b = new char[n];

                for(int j = 0; j < n; j++) {
                    if(x[j] == '2') {
                        a[j] = '1';
                        b[j] = '1';
                    }
                    else if(x[j] == '1') {
                        a[j] = '1';
                        b[j] = '0';
                    }
                    else {
                        a[j] = '0';
                        b[j] = '0';
                    }
                }
                System.out.println(a);
                System.out.println(b);
            }
        }
    }
}
