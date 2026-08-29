import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isPalindrome(s));
    }

    public static String isPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                sb.append(Character.toLowerCase(c));
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