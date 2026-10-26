import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        calculateNeededAdditions(s);
    }

    public static void calculateNeededAdditions(String s) {
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
        
        int missingCount = 0;
        if (!hasVowel) missingCount++;
        if (!hasConsonant) missingCount++;
        if (!hasNumeric) missingCount++;
        if (!hasSpecial) missingCount++;
        
        System.out.print(missingCount);
    }
}