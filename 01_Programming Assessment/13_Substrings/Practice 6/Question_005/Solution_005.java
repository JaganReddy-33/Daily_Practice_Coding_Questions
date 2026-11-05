import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        repeatSubstring(s);
    }

    public static void repeatSubstring(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int i = 0;
        
        while (i < n) {
            int subStart = i;
            while (i < n && !Character.isDigit(s.charAt(i))) {
                i++;
            }
            String sub = s.substring(subStart, i);
            
            int count = 0;
            while (i < n && Character.isDigit(s.charAt(i))) {
                count = count * 10 + (s.charAt(i) - '0');
                i++;
            }
            
            for (int c = 0; c < count; c++) {
                result.append(sub);
            }
        }
        
        System.out.print(result.toString());
    }
}