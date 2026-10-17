import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        printLongestOddSumSubarray(arr, n);
    }

    public static void printLongestOddSumSubarray(int[] arr, int n){
        int maxLen = 0;
        int start = -1;
        int end = -1;

        for(int i=0; i<n; i++){
            int currSum = 0;
            for(int j=i; j<n; j++){
                currSum += arr[j];

                if(currSum%2 != 0){
                    int currLen = j-i+1;
                    if(currLen > maxLen){
                        maxLen = currLen;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        if(maxLen == 0){
            System.out.print("None");
        } else {
            for(int k=start; k<=end; k++){
                System.out.print(arr[k]+" ");
            }
        }
    }
}