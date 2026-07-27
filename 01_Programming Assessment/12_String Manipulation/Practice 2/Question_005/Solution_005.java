import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            char l = input.charAt(left);
            char r = input.charAt(right);

            if (isVowelOrSpace(l)) {
                left++;
            } else if (isVowelOrSpace(r)) {
                right--;
            } else if (l != r) {
                System.out.println("False");
                return;
            } else {
                left++;
                right--;
            }
        }

        System.out.println("True");
    }

    private static boolean isVowelOrSpace(char c) {
        return c == ' ' || "aeiouAEIOU".indexOf(c) != -1;
    }
}