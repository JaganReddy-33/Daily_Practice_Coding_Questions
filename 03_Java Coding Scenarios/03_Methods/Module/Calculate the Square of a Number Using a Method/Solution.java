import java.util.Scanner;

class Main {

    public static int squareNumber(int n){
        return n*n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = squareNumber(n);
        System.out.print(result);
      
    }
}