import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // Your code goes here
        if(num%8==0 && num%9==0){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}