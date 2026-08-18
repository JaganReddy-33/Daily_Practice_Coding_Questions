import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String completedHighSchool = scanner.next();
        
        System.out.println(age<18?"Not Eligible to Apply":completedHighSchool.equalsIgnoreCase("Yes")?"Eligible to Apply":"Complete High School");
    }
}