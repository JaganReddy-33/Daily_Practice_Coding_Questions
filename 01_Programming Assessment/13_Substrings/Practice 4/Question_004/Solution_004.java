import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        boolean isValid = str.length() >= 4 && (str.startsWith("good") || str.startsWith("good", 1));

        System.out.print(isValid);

    }
}