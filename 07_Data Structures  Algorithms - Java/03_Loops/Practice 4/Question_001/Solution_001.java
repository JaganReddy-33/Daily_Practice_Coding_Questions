import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        boolean found = false;

        for (int i = n1; i >= n2; i--) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("-1");
        }
    }
}