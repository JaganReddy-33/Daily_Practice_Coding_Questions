import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        if(N%N == 0 && M%2 != 0){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}