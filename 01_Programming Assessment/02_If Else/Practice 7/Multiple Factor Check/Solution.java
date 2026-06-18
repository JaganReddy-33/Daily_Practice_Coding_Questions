import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        // Your code goes here
        if(N%M == 0 && N%K == 0){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}