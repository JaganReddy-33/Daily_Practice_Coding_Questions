import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            scanner.nextInt();
        }
        
        long totalPairs = (long) n * (n - 1) / 2;
            
        if (totalPairs % 2 != 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
}