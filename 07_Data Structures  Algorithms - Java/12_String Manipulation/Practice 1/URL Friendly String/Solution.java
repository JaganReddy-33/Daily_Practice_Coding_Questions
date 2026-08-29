import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(makeUrlFriendly(s));
    }

    public static String makeUrlFriendly(String str) {
        return str.replace(" ", "%20");
    }
}