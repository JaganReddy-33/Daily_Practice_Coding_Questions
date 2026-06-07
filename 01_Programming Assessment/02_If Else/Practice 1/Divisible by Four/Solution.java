import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n = scanner.nextInt();

        if(n%4 == 0){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}