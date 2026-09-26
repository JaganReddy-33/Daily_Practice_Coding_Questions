import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int idx = scanner.nextInt();

        System.out.print(input.charAt(idx));
    }
}