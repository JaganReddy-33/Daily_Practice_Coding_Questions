import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String first = str.substring(0, 2);
        String last = str.substring(str.length()-2);

        System.out.print(first.eqlast ? "true" : "false");
    }
}