import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(findLastConsonant(s));
    }

    public static String findLastConsonant(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (lower != 'a' && lower != 'e' && lower != 'i' && lower != 'o' && lower != 'u') {
                    return String.valueOf(ch);
                }
            }
        }
        return "-1";
    }
}