import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        printEvenMultiplesOfThree(n1, n2);
    }

    public static void printEvenMultiplesOfThree(int n1, int n2) {
        int start = Math.min(n1, n2);
        int end = Math.max(n1, n2);
        for (int i = start; i <= end; i++) {
            if (i % 6 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}