import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printDecimalToBinary(n);
    }

    public static void printDecimalToBinary(int n) {
        System.out.println(Integer.toBinaryString(n));
    }
}