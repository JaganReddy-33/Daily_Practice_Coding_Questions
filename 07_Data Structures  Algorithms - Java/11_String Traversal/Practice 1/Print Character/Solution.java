import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printChar(scanner);
    }

    static void printChar(Scanner scanner) {
        char ch = scanner.next().charAt(0);
        System.out.print(ch);
    }
}