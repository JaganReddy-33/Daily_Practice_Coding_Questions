import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        separateVowelsAndConsonants(s);
    }

    public static boolean isVowel(char ch) {
        char lower = Character.toLowerCase(ch);
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
    }

    public static void separateVowelsAndConsonants(String s) {
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowels.append(ch);
                } else {
                    consonants.append(ch);
                }
            }
        }
        
        System.out.print(vowels.toString() + consonants.toString());
    }
}