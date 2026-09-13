import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];      
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean found = false;   
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                int root = (int) Math.sqrt(arr[i]);
                if (root * root == arr[i]) {
                    System.out.print(arr[i] + " ");
                    found = true;
                }
            }
        }
        
        if (!found) {
            System.out.print("-1");
        }
    }
}