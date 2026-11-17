import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        printEvenSubarrays(arr, n);
    }

    public static void printEvenSubarrays(int[] arr, int n) {
        boolean found = false;

        for(int len=1; len<=n; len++) {
            for(int i=0; i<=n-len; i++) {
                int j = i+len-1;
                int sum = 0;

                for(int k=i; k<=j; k++) {
                    sum += arr[k];
                }

                if(sum % 2 == 0) {
                    for(int k=i; k<=j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                    found = true;
                }
            }
        }

        if(!found) {
            System.out.print("None");
        }
    }
}