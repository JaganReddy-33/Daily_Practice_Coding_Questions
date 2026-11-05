import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        checkPalindromeSubstringEvenLen(s);
    }

    public static void checkPalindromeSubstringEvenLen(String s){

        boolean hasEvenPalindrome = false;
        int n = s.length();
        
        for (int i = 0; i < n - 1; i++) {
            int left = i;
            int right = i + 1;
            
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                hasEvenPalindrome = true;
                left--;
                right++;
            }
            
            if (hasEvenPalindrome) {
                break;
            }
        }
        
        System.out.print(hasEvenPalindrome);
    }
}