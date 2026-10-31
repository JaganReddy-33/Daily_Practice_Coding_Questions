import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        printConsonantSubstrings(input);
    }

    public static boolean isVowel(char ch) {
        char lower = Character.toLowerCase(ch);
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
    }

    public static boolean isConsonant(char ch) {
        return Character.isLetter(ch) && !isVowel(ch);
    }

    public static void printConsonantSubstrings(String input) {
        List<String> consonantSubstrings = new ArrayList<>();
        int n = input.length();
        
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                String sub = input.substring(i, i + len);
                
                boolean allConsonants = true;
                for (int k = 0; k < sub.length(); k++) {
                    if (!isConsonant(sub.charAt(k))) {
                        allConsonants = false;
                        break;
                    }
                }
                
                if (allConsonants) {
                    consonantSubstrings.add(sub);
                }
            }
        }
        
        if (consonantSubstrings.isEmpty()) {
            System.out.print("No consonant substrings");
        } else {
            System.out.print(String.join(" ", consonantSubstrings));
        }
    }
}