import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if ((num % 3 == 0) ^ (num % 5 == 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}