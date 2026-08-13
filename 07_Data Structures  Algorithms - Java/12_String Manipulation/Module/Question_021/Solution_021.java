import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        
        System.out.println(new String(chars));
    }
}