import java.util.Scanner;

class Main {

    public static int cubeOfNumber(int n){
        return n*n*n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int res = cubeOfNumber(n);
        System.out.print(res);

    }
}