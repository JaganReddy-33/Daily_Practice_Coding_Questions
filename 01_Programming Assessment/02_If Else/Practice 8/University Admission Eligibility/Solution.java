import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String completedHighSchool = scanner.next();
        if(age >= 18){
            if(completedHighSchool.equalsIgnoreCase("Yes")){
                System.out.print("Eligible to Apply");
            } else {
                System.out.print("Complte High School");
            }
        } else {
            System.out.print("Not Eligible to Apply");
        }
    }
}