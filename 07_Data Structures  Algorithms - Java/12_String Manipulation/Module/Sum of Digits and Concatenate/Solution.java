import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        StringBuilder result = new StringBuilder();
        int sum = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += ch - '0';
            } else {
                result.append(ch);
            }
        }

        result.append(sum);
        System.out.println(result);
    }
}