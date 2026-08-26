import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isOnlySpecialChars(s) ? "True" : "False");
    }

    public static boolean isOnlySpecialChars(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}