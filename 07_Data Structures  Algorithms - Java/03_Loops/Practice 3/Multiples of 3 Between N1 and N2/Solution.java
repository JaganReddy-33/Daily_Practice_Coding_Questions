import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = n1; i <= n2; i++) {
            if (i % 3 == 0) {
                sb.append(i).append(" ");
            }
        }
        System.out.print(sb);
    }
}