import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if(n%2==0 && m%2==0){
            System.out.print(n*m);
        } else {
            System.out.print(n+m);
        }
        
    }
}