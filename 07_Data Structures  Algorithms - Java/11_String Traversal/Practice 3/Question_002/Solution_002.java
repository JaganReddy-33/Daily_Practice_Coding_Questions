import java.util.Scanner;

public class Main {
    public static int sumOfEvenDigits(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                if (digit % 2 == 0) {
                    sum += digit;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(sumOfEvenDigits(s));
        }
        sc.close();
    }
}