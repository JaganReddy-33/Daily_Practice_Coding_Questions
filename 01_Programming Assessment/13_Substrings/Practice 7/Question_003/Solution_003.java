
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int k = sc.nextInt();

        boolean found = false;

        int maxLen = Math.min(3, k - 1);

        for (int len = 1; len <= maxLen; len++) {
            for (int i = 0; i <= s.length() - len; i++) {
                System.out.println(s.substring(i, i + len));
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }

        sc.close();
    }
}
