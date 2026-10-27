import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        checkValidPalindrome(s);
    }

    public static void checkValidPalindrome(String s) {
        StringBuilder filtered = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isLetterOrDigit(ch)) {
                filtered.append(Character.toLowerCase(ch));
            }
        }
        
        String str = filtered.toString();
        String rev = filtered.reverse().toString();
        
        if (str.equals(rev)) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}