import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char target = scanner.nextLine().charAt(0);
        
        int n = s.length();
        int maxLen = 0;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == target) {
                for (int j = n - 1; j >= i; j--) {
                    if (s.charAt(j) == target) {
                        if (isPalindrome(s, i, j)) {
                            maxLen = Math.max(maxLen, j - i + 1);
                            break;
                        }
                    }
                }
            }
        }
        
        System.out.print(maxLen);
    }
    
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}