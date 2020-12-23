import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                String word = scanner.next();
                int wordSize = word.length();

                int hiddenChar = wordSize - 2;

                if (wordSize > 10) {
                    System.out.println(word.substring(0, 1) + hiddenChar + word.substring(wordSize - 1, wordSize));
                }
                else {
                    System.out.println(word);
                }
            }
        }
    }
}
