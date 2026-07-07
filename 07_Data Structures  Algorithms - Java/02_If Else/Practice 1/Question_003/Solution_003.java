import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        // Your code goes here
        if(num > 0){
            System.out.print("Positive");
        } else if(num < 0){
            System.out.print("Negative");
        } else {
            System.out.print("Zero");
        }
    }
}