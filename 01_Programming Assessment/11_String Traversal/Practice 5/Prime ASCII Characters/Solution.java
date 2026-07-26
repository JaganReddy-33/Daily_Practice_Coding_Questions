import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        if (n <= 1) return false; 
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isPrime((int) c)) {
                result.append(c);
            }
        }
        
        System.out.print(result.toString());
    }
}