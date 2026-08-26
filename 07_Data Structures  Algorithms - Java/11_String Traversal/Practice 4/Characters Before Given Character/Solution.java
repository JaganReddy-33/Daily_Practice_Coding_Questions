import java.util.Scanner;

public class Main {
    public static String getCharactersBefore(String s, char ch) {
        int index = s.indexOf(ch);
        if (index != -1) {
            return s.substring(0, index);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        System.out.println(getCharactersBefore(s, ch));
    }
}