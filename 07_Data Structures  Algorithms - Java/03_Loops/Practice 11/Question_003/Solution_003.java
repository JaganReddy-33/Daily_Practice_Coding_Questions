import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        printPrimeDigits(n);
    }

    public static void printPrimeDigits(String n) {
        boolean found = false;
        for (int i = n.length() - 1; i >= 0; i--) {
            char ch = n.charAt(i);
            if (ch == '2' || ch == '3' || ch == '5' || ch == '7') {
                if (found) {
                    System.out.print(" ");
                }
                System.out.print(ch);
                found = true;
            }
        }
        if (!found) {
            System.out.print("No prime digits");
        }
    }
}