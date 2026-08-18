import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 7) {
            System.out.println("-1");
            return;
        }
        for (int i = 7; i <= n; i += 7) {
            System.out.print(i + " ");
        }
    }
}