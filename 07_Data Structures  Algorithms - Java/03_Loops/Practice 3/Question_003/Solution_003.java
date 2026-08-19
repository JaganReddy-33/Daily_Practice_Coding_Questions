import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = n; i <= m; i+=n) {
            sb.append(i).append(" ");
        }
        System.out.print(sb);
    }
}