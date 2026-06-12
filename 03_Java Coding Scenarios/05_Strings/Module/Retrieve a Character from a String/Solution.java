import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str  = scanner.nextLine();
        int idx = scanner.nextInt();

        System.out.print(str.charAt(idx));
    }
}