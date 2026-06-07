import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // Your code goes here
        if(num > 10 && num %2 == 0){
            System.out.print("Even and greater than 10");
        } else {
            System.out.print("Not even or not greater than 10");
        }
    }
}