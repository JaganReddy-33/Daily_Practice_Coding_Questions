import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isPalindrome(s));
    }

    public static String isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || Character.isDigit(ch)) {
                sb.append(ch);
            }
        }
        String filtered = sb.toString();
        String reversed = sb.reverse().toString();
        if (filtered.equals(reversed)) {
            return "True";
        }
        return "False";
    }
}