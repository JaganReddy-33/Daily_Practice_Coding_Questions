import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        printSmallestEvenDiff(arr, n);
    }

    public static void printSmallestEvenDiff(int[] arr, int n) {
        int minLen = Integer.MAX_VALUE;
        int start = -1;
        int end = -1;

        for(int i=0; i<n; i++) {
            int maxVal = arr[i];
            int minVal = arr[i];

            for(int j=i+1; j<n; j++) {
                maxVal = Math.max(maxVal, arr[j]);
                minVal = Math.min(minVal, arr[j]);

                if((maxVal - minVal) % 2 == 0){
                    int len = j-i+1;
                    if(len < minLen) {
                        minLen = len;
                        start = i;
                        end = j;
                    }
                }
            }
        }

        if(minLen == Integer.MAX_VALUE) {
            System.out.print("None");
        } else {
            for(int k=start; k<=end; k++) {
                System.out.print(arr[k] + " ");
            }
        }
    }
}