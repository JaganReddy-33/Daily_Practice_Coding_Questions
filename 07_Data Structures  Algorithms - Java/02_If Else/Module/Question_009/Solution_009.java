import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>=100 && n<=999 && n%2==0 && n%5==0 && n%10==0){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        
    }
}