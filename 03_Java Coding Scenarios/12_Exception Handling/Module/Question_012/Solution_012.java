import java.util.Scanner;

class CourseFullException extends Exception {
    @Override
    public String getMessage() {
        return "Error: The course is full.";
    }
}

class PrerequisiteNotMetException extends Exception {
    @Override
    public String getMessage() {
        return "Error: You must complete the prerequisite course first.";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int slots = scanner.nextInt();
        boolean hasPrerequisite = scanner.nextBoolean();

        try {
            if (slots <= 0) {
                throw new CourseFullException();
            } else if (!hasPrerequisite) {
                throw new PrerequisiteNotMetException();
            } else {
                System.out.println("Enrollment successful: You are now enrolled in the course.");
            }
        } catch (CourseFullException e) {
            System.out.println(e.getMessage());
        } catch (PrerequisiteNotMetException e) {
            System.out.println(e.getMessage());
        }
    }
}