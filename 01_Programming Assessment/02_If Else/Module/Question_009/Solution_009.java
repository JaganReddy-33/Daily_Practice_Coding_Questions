import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String res = (n>99 && n<1000 && n%2 == 0 && n%5 == 0 && n%10 == 0) ? "Yes" : "No";
        System.out.print(res);
        
    }
}