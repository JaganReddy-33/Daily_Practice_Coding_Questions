import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine().toLowerCase();
        processAndPrintConsonants(input);
    }

    public static void processAndPrintConsonants(String input) {
        TreeSet<Character> set = new TreeSet<>();
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                set.add(ch);
            }
        }
        if (set.isEmpty()) {
            System.out.println(-1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}