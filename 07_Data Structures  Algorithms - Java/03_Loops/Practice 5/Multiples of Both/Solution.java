import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int start = Math.min(n1, n2);
        int end = Math.max(n1, n2);

        for (int i = start; i <= end; i++) {
            if (i % x == 0 && i % y == 0) {
                System.out.print(i + " ");
            }
        }
    }
}