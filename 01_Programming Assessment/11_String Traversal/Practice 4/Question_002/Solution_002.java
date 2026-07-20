import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        System.out.print(str.contains(String.valueOf(ch)) ? "True" : "False");
    }
}