import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        int vowels = 0;
        int consonants = 0;
        int specialChars = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            char lowerCh = Character.toLowerCase(ch);

            if (lowerCh >= 'a' && lowerCh <= 'z') {
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <= '9') {
                continue;
            } else {
                specialChars++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Special Characters: " + specialChars);
    }
}