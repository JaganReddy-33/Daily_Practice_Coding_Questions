import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int num=scanner.nextInt();

        int rem = num % 10;
        System.out.print(rem);
        return;

    }
}