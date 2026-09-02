import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printDigitsInWords(n);
    }

    public static void printDigitsInWords(int n) {
        String s = String.valueOf(n);
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "Seven", "Eight", "Nine"};
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            System.out.print(words[digit] + " ");
        }
    }
}