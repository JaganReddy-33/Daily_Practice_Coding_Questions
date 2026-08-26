import java.util.Scanner;

public class Main {
    public static String getCharactersAfter(String s, char ch) {
        int index = s.indexOf(ch);
        if (index != -1 && index + 1 < s.length()) {
            return s.substring(index + 1);
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        System.out.println(getCharactersAfter(s, ch));
    }
}