import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =scanner.nextInt();
        }

        printProductOfUniqueEle(arr, n);
    }

    public static void printProductOfUniqueEle(int[] arr, int n) {
        long prod = 1;
        boolean foundUnique = false; 

        for(int i=0; i<n; i++) {
            boolean isLeftDiff = (i==0) || (arr[i] != arr[i-1]);
            boolean isRightDiff = (i == n-1) || (arr[i] != arr[i+1]);

            if(isLeftDiff && isRightDiff){
                prod *= arr[i];
                foundUnique = true;
            }
        }
        System.out.println(!foundUnique ? "0" : prod);
    }
}