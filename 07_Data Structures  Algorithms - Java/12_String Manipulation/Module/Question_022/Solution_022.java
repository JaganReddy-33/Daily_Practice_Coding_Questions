import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        boolean[] seen = new boolean[256];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                sb.append(ch);
            }
        }
        
        System.out.println(sb.toString());
    }
}