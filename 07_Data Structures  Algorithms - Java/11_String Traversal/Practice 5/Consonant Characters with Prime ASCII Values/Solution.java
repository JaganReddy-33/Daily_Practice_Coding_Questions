import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        printConsonantsWithPrimeAscii(s);
    }

    public static void printConsonantsWithPrimeAscii(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isConsonant(c) && isPrime((int) c)) {
                sb.append(c);
            }
        }
        if (sb.length() == 0) {
            System.out.print("-1");
        } else {
            System.out.print(sb.toString());
        }
    }

    public static boolean isConsonant(char c) {
        return c != ' ' && "aeiouAEIOU".indexOf(c) == -1;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}