import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();
        printVowelsWithPrimeAscii(s);
    }

    public static void printVowelsWithPrimeAscii(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c) && isPrime((int) c)) {
                result.append(c);
            }
        }
        if (result.length() == 0) {
            System.out.print("-1");
        } else {
            System.out.print(result.toString());
        }
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}