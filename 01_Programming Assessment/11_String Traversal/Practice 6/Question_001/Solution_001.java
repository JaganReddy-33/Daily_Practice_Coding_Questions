import java.util.Scanner;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNext()) return;
        String s = scanner.next();
        
        checkAllVowels(s);
    }

    public static void checkAllVowels(String s) {
        HashSet<Character> vowels = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels.add(ch);
            }
        }
        
        if (vowels.size() == 5) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}