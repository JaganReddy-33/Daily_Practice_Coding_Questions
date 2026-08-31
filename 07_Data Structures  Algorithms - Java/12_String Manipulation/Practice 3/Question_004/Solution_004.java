import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(removeCharacters(s));
    }

    public static String removeCharacters(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'b') {
                continue;
            } else if (c == 'c' && sb.length() > 0 && sb.charAt(sb.length() - 1) == 'a') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        if (sb.length() == 0) {
            return "-1";
        }
        return sb.toString();
    }
}