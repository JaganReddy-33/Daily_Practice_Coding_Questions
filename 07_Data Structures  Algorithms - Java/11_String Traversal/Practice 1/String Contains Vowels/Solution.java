import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        checkOnlyVowels(str);
    }

    static void checkOnlyVowels(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("AEIOUaeiou".indexOf(ch) == -1) {
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }
}