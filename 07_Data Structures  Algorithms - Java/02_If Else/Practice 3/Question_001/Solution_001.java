import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >= 30 && num <= 50) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}