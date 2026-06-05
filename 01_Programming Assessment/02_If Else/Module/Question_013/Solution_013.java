import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n>=65 && n<=90 || n>=97 && n<=122){
            System.out.print((char)n);
        }
       
    }
}