import java.util.Scanner;

public class Main {
    static void squarePattern(int n)
    {
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        squarePattern(n);
    }
}