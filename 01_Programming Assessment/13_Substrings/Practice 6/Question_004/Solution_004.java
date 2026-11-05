import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        long x = scanner.nextLong();
        
        substringWithNumVal(s, x);
    }
    public static void substringWithNumVal(String s, long x) {
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s.charAt(i))) {
                long currentVal = 0;
                int j = i;
                
                while (j < n && Character.isDigit(s.charAt(j))) {
                    int digit = s.charAt(j) - '0';
                    currentVal = currentVal * 10 + digit;
                    j++;
                }
                
                if (currentVal > x) {
                    System.out.println(s.substring(i, j));
                }
                
                i = j - 1; 
            }
        }
    }
}