import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        long decimal = Long.parseLong(s, 2);
        System.out.println(decimal);
    }
}