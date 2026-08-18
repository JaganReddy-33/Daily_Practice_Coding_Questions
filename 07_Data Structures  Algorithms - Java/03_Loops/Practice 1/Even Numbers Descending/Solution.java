import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println("None");
            return;
        }
        int start = (n % 2 == 0) ? n : n - 1;
        for (int i = start; i >= 2; i -= 2) {
            System.out.print(i + (i > 2 ? " " : ""));
        }
    }
}