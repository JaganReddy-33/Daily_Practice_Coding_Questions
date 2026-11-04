import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        
        int n = s.length();
        if (k > n || k <= 0) {
            System.out.print(0);
            return;
        }
        
        int count = 0;
        
        for (int i = 0; i <= n - k; i++) {
            boolean allSame = true;
            char firstChar = s.charAt(i);
            
            for (int j = 1; j < k; j++) {
                if (s.charAt(i + j) != firstChar) {
                    allSame = false;
                    break;
                }
            }
            
            if (allSame) {
                count++;
            }
        }
        
        System.out.print(count);
    }
}