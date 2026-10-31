import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        printNumericSubstrings(input);
    }

    public static void printNumericSubstrings(String input) {
        List<String> numericSubstrings = new ArrayList<>();
        int n = input.length();
        
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                String sub = input.substring(i, i + len);
                
                boolean allDigits = true;
                for (int k = 0; k < sub.length(); k++) {
                    if (!Character.isDigit(sub.charAt(k))) {
                        allDigits = false;
                        break;
                    }
                }
                
                if (allDigits) {
                    numericSubstrings.add(sub);
                }
            }
        }
        
        if (numericSubstrings.isEmpty()) {
            System.out.print("No numeric substrings");
        } else {
            System.out.print(String.join(" ", numericSubstrings));
        }
    }
}