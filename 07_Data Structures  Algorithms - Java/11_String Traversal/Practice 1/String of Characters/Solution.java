import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char ch = scanner.next().charAt(0);
        generateString(n, ch);
    }

    static void generateString(int n, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(ch);
        }
        System.out.print(sb.toString());
    }
}