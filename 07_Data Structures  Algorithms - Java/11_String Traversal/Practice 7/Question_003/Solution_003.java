import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkCharacters(s));
    }

    public static String checkCharacters(String s) {
        boolean hasVowel = false;
        boolean hasConsonant = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isWhitespace(ch)) {
                hasSpecial = true;
            }
        }

        if (hasVowel && hasConsonant && hasDigit && hasSpecial) {
            return "yes";
        }
        return "no";
    }
}