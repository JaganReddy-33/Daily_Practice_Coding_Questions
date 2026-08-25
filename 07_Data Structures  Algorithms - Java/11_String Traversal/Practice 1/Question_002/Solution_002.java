import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int index = scanner.nextInt();
        printCharAt(s, index);
    }

    static void printCharAt(String str, int index) {
        System.out.print(str.charAt(index));
    }
}