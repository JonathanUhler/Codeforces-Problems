import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            while(scanner.hasNext()) {
                int t = scanner.nextInt();
                int n = scanner.nextInt();

                int weight = 0;
                int weightPow = 0;

                for (int i = 0; i < t; i++) {
                    for (int j = 0; j < n; j++) {
                        weight += Math.pow(2, weightPow);
                        weightPow += 1;
                        if ((weight)/2-1 > 0) {
                            System.out.println(Math.floor((weight) / 2 - 1));
                        }
                    }
                }
            }
    }
}
