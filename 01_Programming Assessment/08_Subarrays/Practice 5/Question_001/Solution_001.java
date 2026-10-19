import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        printSubarraysWithProdK(arr, n, k);
    }

    public static void printSubarraysWithProdK(int[] arr, int n, int k) {
        boolean found = false;

        for(int len=1; len<=n; len++) {
            for(int i=0; i<=n-len; i++){
                int j = i+len-1;

                long prod = 1;
                for(int m=i; m<=j; m++){
                    prod *= arr[m];
                }

                if(prod == k){
                    found = true;
                    for(int m = i; m<=j; m++){
                        System.out.print(arr[m] + " ");
                    }
                    System.out.println();
                }
            }
        }
        if(!found){
            System.out.print("None");
        }
    }
}