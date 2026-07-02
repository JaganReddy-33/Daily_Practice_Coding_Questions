import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n=scanner.nextInt();
        int first = 0;
        int second = 1;
        for(int i=1; i<=n; i++){
            System.out.print(first+" ");
            int temp = first + second;
            first = second;
            second = temp;
        }
    }
}