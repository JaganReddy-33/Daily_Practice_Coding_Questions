import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNext()) return;
        String s = scanner.next();
        
        checkNumericOnly(s);
    }

    public static void checkNumericOnly(String s) {
        if (s == null || s.isEmpty()) {
            System.out.print("False");
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                System.out.print("False");
                return;
            }
        }
        
        System.out.print("True");
    }
}