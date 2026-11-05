import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        long x = scanner.nextLong();
        
        countSubstringsWithNumVal(s, x);
    }

    public static void countSubstringsWithNumVal(String s, long x) {
        int n = s.length();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            long currentVal = 0;
            for (int j = i; j < n; j++) {
                int digit = s.charAt(j) - '0';
                
                if (currentVal > (Long.MAX_VALUE - digit) / 10) {
                    count += (n - j);
                    break;
                }
                
                currentVal = currentVal * 10 + digit;
                
                if (currentVal > x) {
                    count++;
                }
            }
        }
        
        System.out.print(count);
    }
}