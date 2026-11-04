import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        int n = s.length();
        long count = 0;
        
        for (int i = 0; i < n; i++) {
            int c0 = 0, c1 = 0, c2 = 0;
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                if (ch == '0') c0++;
                else if (ch == '1') c1++;
                else if (ch == '2') c2++;
                
                if (c0 == c1 && c1 == c2) {
                    count++;
                }
            }
        }
        
        System.out.print(count);
    }
}