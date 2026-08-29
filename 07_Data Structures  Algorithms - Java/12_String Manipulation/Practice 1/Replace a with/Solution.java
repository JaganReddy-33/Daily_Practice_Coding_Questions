import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(replaceChar(s));
    }

    public static String replaceChar(String str) {
        return str.replace('a', '@');
    }
}