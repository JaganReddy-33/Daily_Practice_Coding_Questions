import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n%5 == 0){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        
    }
}