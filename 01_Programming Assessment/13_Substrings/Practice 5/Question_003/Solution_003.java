import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = scanner.next();
        String s2 = scanner.next();

        String res = s.replace(s1, s2);
        System.out.print(res);
    }
}