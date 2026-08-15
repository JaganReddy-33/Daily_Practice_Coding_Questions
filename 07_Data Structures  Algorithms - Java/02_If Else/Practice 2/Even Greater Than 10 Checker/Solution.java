import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num%2 == 0 && num > 10){
            System.out.print("Even and greater than 10");
        } else {
            System.out.print("Not even or not greater than 10");
        }
    }
}