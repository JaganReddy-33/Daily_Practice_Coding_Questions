import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        vowelAsciiReplacer(s);
    }

    public static boolean isVowel(char ch) {
        char lower = Character.toLowerCase(ch);
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
    }

    public static void vowelAsciiReplacer(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (isVowel(ch)) {
                sb.append((int) ch);
            } else {
                sb.append(ch);
            }
        }
        
        System.out.print(sb.toString());
    }
}