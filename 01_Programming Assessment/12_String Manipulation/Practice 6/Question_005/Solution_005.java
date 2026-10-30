import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        consecutiveCharacterOccurrences(s);
    }

    public static void consecutiveCharacterOccurrences(String s) {
        if (s == null || s.isEmpty()) return;
        
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int count = 1;
        
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        
        System.out.print(sb.toString());
    }
}