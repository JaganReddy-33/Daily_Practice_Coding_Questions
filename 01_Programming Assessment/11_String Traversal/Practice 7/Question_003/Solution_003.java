import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        checkVariousCharacters(s);
    }

    public static void checkVariousCharacters(String s) {
        boolean hasVowel = false;
        boolean hasConsonant = false;
        boolean hasNumeric = false;
        boolean hasSpecial = false;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char lowerCh = Character.toLowerCase(ch);
            
            if (Character.isDigit(ch)) {
                hasNumeric = true;
            } else if (Character.isLetter(ch)) {
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            } else {
                hasSpecial = true;
            }
        }
        
        if (hasVowel && hasConsonant && hasNumeric && hasSpecial) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}