import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) return;
        String s = scanner.nextLine();
        
        findFirstVowelAlphabetically(s);
    }

    public static void findFirstVowelAlphabetically(String s) {
        char smallestVowel = '{';
        char originalChar = ' ';
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char lowerCh = Character.toLowerCase(ch);
            
            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                if (lowerCh < smallestVowel) {
                    smallestVowel = lowerCh;
                    originalChar = ch; // Keep the original case
                }
            }
        }
        
        if (smallestVowel == '{') {
            System.out.print("-1");
        } else {
            System.out.print(originalChar);
        }
    }
}