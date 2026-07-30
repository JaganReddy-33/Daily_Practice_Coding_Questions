import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int num = scanner.nextInt();
            int den = scanner.nextInt();
            int res = num / den;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            System.out.println("Operation finished");
        }
    }
}