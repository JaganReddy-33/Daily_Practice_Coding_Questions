import java.util.Scanner;

public class Main {
    public static boolean checkConsonantCount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (lower != 'a' && lower != 'e' && lower != 'i' && lower != 'o' && lower != 'u') {
                    count++;
                }
            }
        }
        return count > 5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (checkConsonantCount(s)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}