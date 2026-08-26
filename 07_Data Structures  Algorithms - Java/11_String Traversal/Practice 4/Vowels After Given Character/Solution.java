import java.util.Scanner;

public class Main {
    public static String getVowelsAfterChar(String s, char ch) {
        int index = s.indexOf(ch);
        if (index == -1) {
            return "-1";
        }
        StringBuilder res = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for (int i = index + 1; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                res.append(s.charAt(i));
            }
        }
        return res.length() > 0 ? res.toString() : "-1";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        System.out.println(getVowelsAfterChar(s, ch));
    }
}