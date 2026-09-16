import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        printEvenMultiplesOfThreeDescending(n1, n2);
    }

    public static void printEvenMultiplesOfThreeDescending(int n1, int n2) {
        int start = Math.max(n1, n2);
        int end = Math.min(n1, n2);
        for (int i = start; i >= end; i--) {
            if (i % 6 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}