import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        int start = (m / n) * n;
        for (int i = start; i >= n; i -= n) {
            sb.append(i).append(" ");
        }
        System.out.print(sb);
    }
}