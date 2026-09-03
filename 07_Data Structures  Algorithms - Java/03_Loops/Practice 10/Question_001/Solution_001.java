import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long res = 1;
        for(int i=1; i<=m; i++){
            res *= n;
        }
        System.out.print(res);
    }
}