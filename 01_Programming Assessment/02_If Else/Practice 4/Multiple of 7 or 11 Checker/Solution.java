import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        // Your code goes here
        if(num%7 == 0 || num%11 == 0){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}