import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.print(findFirstVowelAlphabetically(s));
    }

    public static String findFirstVowelAlphabetically(String s) {
        char minVowel = '{';
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (isVowel(c)) {
                if (c < minVowel) {
                    minVowel = c;
                }
            }
        }
        if (minVowel == '{') {
            return "-1";
        }
        return String.valueOf(minVowel);
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}