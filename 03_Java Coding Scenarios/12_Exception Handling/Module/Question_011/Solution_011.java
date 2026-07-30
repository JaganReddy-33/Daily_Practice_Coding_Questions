import java.util.Scanner;

class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}

class OverAgeException extends Exception {
    public OverAgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        try {
            if (age < 18) {
                throw new UnderAgeException("You are too young. Have patience!");
            } else if (age > 60) {
                throw new OverAgeException("You are too old. Cool down!");
            } else {
                System.out.println("Eligibility confirmed: You can apply for a driving license.");
            }
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        } catch (OverAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}