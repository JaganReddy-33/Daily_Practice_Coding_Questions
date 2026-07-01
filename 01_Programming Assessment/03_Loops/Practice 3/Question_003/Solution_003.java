import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n=scanner.nextInt();
        int m=scanner.nextInt();

        for(int i=n; i<=m; i++){
            if(i%n == 0){
                System.out.print(i+" ");
            }
        }
    }
}