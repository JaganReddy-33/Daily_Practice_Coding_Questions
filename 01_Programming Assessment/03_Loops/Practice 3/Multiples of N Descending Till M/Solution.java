import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();

        for(int i=m; i>=n; i--){
            if(i%n == 0){
                System.out.print(i+" ");
            }
        }
    }
}