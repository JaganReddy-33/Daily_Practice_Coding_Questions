import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n=scanner.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(i*7+" ");
        }
    }
}