import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>0){
            System.out.print("Positive");
        } else if(n<0){
            System.out.print("Negative");
        } else {
            System.out.print("Zero");
        }
        
    }
}