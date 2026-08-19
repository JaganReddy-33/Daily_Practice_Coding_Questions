import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 3) {
            System.out.print("-1");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 3; i--) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(i);
            }
        }
        System.out.print(sb);
    }
}