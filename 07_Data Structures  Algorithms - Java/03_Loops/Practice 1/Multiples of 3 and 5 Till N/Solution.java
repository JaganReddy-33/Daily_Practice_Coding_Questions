import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 15) {
            System.out.println("-1");
            return;
        }
        for (int i = 15; i <= n; i += 15) {
            System.out.print(i + (i + 15 <= n ? " " : ""));
        }
    }
}