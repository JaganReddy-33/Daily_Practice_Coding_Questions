import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        if (M != 0 && N % M == 0 && Math.abs(M) % 2 != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}