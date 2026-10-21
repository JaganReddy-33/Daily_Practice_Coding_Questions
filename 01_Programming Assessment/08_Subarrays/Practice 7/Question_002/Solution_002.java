import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();      
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printPerfectSquareLengthSubarrays(arr, n);
    }

    public static void printPerfectSquareLengthSubarrays(int[] arr, int n) {
        boolean found = false;

        for (int len = 1; len <= n; len++) {
            if (isPerfectSquare(len)) {
                for (int i = 0; i <= n - len; i++) {
                    int j = i + len - 1;
                    found = true;
                    
                    for (int m = i; m <= j; m++) {
                        System.out.print(arr[m] + " ");
                    }
                    System.out.println();
                }
            }
        }

        if (!found) {
            System.out.print("None");
        }
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}