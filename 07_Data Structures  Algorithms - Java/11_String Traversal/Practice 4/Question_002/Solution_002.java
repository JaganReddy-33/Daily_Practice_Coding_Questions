import java.util.Scanner;

public class Main {
    public static boolean isCharPresent(String s, char c) {
        return s.indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        if (isCharPresent(s, c)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}