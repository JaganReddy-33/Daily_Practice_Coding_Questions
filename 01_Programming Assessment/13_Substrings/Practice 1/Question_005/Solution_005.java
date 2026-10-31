import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        System.out.print(countVowelSubstrings(input));
    }

    public static boolean isVowel(char ch) {
        char lower = Character.toLowerCase(ch);
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
    }

    public static int countVowelSubstrings(String input) {
        int count = 0;
        int n = input.length();
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = input.substring(i, j + 1);
                
                boolean allVowels = true;
                for (int k = 0; k < sub.length(); k++) {
                    if (!isVowel(sub.charAt(k))) {
                        allVowels = false;
                        break;
                    }
                }
                
                if (allVowels) {
                    count++;
                }
            }
        }
        
        return count;
    }
}