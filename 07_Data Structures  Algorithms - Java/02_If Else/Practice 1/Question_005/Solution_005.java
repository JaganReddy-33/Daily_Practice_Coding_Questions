import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // Your code goes here
        String checker = (num > 100) ? "Greater than 100" : "Not greater than 100";
        System.out.print(checker);
    }
}