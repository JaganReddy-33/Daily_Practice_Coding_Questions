import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(calculateUnicodeSum(s));
    }

    public static int calculateUnicodeSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (int) s.charAt(i);
        }
        return sum;
    }
}