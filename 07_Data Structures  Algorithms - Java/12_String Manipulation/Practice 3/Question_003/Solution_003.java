import java.util.Scanner;

public class Main {

    public static String isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }

        String filtered = sb.toString();

        int left = 0;
        int right = filtered.length() - 1;

        while (left < right) {
            if (filtered.charAt(left) != filtered.charAt(right)) {
                return "False";
            }
            left++;
            right--;
        }

        return "True";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            System.out.println(isPalindrome(s));
        }
        scanner.close();
    }
}