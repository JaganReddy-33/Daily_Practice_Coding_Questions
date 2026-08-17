import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        System.out.println((M != 0 && K != 0 && N % M == 0 && N % K == 0) ? "Yes" : "No");
    }
}