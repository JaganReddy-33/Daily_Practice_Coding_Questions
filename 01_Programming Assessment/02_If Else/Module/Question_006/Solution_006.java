import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String res = (n>9 && n<100) ? "Yes" : "No";
        System.out.print(res);
        
    }
}