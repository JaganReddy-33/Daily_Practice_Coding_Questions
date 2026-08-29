import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char ch1 = scanner.next().charAt(0);
        char ch2 = scanner.next().charAt(0);
        System.out.println(replaceChar(s, ch1, ch2));
    }

    public static String replaceChar(String str, char ch1, char ch2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ch1) {
                sb.append(ch2);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}