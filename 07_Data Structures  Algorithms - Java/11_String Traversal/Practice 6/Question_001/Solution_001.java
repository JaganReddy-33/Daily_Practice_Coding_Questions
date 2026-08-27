import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (containsAllVowels(s)) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }

    public static boolean containsAllVowels(String s) {
        boolean hasA = false, hasE = false, hasI = false, hasO = false, hasU = false;
        for (int k = 0; k < s.length(); k++) {
            char c = s.charAt(k);
            if (c == 'a' || c == 'A') hasA = true;
            else if (c == 'e' || c == 'E') hasE = true;
            else if (c == 'i' || c == 'I') hasI = true;
            else if (c == 'o' || c == 'O') hasO = true;
            else if (c == 'u' || c == 'U') hasU = true;
        }
        return hasA && hasE && hasI && hasO && hasU;
    }
}