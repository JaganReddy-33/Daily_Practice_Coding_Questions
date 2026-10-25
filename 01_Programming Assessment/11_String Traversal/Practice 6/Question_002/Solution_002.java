import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNext()) return;
        String s = scanner.next();
        
        checkConsonantsOnly(s);
    }

    public static void checkConsonantsOnly(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || !Character.isLetter(ch)) {
                System.out.print("False");
                return;
            }
        }
        
        System.out.print("True");
    }
}