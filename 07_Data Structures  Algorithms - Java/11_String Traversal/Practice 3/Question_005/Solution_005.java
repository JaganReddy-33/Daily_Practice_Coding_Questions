import java.util.Scanner;

public class Main {
    public static boolean checkVowelCount(String s) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        return count > 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (checkVowelCount(s)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}