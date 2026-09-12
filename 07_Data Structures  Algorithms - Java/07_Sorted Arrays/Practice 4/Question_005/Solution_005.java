import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        printUniqueFactorsOfK(arr, k);
    }

    static boolean isFactor(int num, int k) {
        if(num == 0) return false;
        return k % num == 0;
    }

    static void printUniqueFactorsOfK(int[] arr, int k) {
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            boolean leftDiff = (i == 0 || arr[i] != arr[i - 1]);
            boolean rightDiff = (i == arr.length - 1 || arr[i] != arr[i + 1]);

            if(leftDiff && rightDiff && isFactor(arr[i], k)) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }
        if(!found) {
            System.out.print("None");
        }
    }
}