import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        printVowelSubstrings(input);
    }

    public static boolean isVowel(char ch) {
        char lower = Character.toLowerCase(ch);
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
    }

    public static void printVowelSubstrings(String input) {
        List<String> vowelSubstrings = new ArrayList<>();
        int n = input.length();
        
        // Loop by length of the substring (from 1 up to n)
        for (int len = 1; len <= n; len++) {
            // Find all valid vowel substrings of this specific length in left-to-right order
            for (int i = 0; i <= n - len; i++) {
                String sub = input.substring(i, i + len);
                
                boolean allVowels = true;
                for (int k = 0; k < sub.length(); k++) {
                    if (!isVowel(sub.charAt(k))) {
                        allVowels = false;
                        break;
                    }
                }
                
                if (allVowels) {
                    vowelSubstrings.add(sub);
                }
            }
        }
        
        if (vowelSubstrings.isEmpty()) {
            System.out.print("No vowel substrings");
        } else {
            System.out.print(String.join(" ", vowelSubstrings));
        }
    }
}