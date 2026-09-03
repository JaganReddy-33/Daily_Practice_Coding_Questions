import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        printOddDigits(n);
    }

    public static void printOddDigits(String n) {
        boolean found = false;
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            int digit = ch - '0';
            if (digit % 2 != 0) {
                if (found) {
                    System.out.print(" ");
                }
                System.out.print(digit);
                found = true;
            }
        }
        if (!found) {
            System.out.print("No odd digits");
        }
    }
}