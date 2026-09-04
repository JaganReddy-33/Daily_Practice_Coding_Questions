import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean found = false;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                int fact = 1;
                for (int j = 1; j <= digit; j++) {
                    fact *= j;
                }
                sum += fact;
                temp /= 10;
            }
            if (sum == i) {
                if (found) {
                    System.out.print(" ");
                }
                System.out.print(i);
                found = true;
            }
        }
        if (!found) {
            System.out.print("No strong numbers");
        }
    }
}