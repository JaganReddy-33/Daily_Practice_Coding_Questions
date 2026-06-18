import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>=48 && n<=57){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        
    }
}