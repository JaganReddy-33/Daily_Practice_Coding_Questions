import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (consistsOnlyOfConsonants(s)) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }

    public static boolean consistsOnlyOfConsonants(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowelOrSpace(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isVowelOrSpace(char c) {
        return c == ' ' || "aeiouAEIOU".indexOf(c) != -1;
    }
}