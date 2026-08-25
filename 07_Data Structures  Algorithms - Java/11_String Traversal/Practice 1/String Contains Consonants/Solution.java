import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNext()) return;
        String s = scanner.next();
        System.out.println(onlyConsonants(s) ? "Yes" : "No");
    }

    public static boolean onlyConsonants(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (!Character.isLetter(ch) || "aeiou".indexOf(ch) != -1) {
                return false;
            }
        }
        return true;
    }
}