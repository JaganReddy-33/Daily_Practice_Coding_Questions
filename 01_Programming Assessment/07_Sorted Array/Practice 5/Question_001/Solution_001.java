import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        printPrimeRepeatedValues(arr, n);
    }

    public static void printPrimeRepeatedValues(int[] arr, int n) {
        boolean found = false;

        for(int i=0; i<n; i++) {
            boolean isLeftDiff = (i == 0) || (arr[i] != arr[i-1]);
            boolean isRightDiff = (i == n-1) || (arr[i] != arr[i+1]);

            if(!isLeftDiff || !isRightDiff) {
                if(isLeftDiff && isPrime(arr[i])) {
                    System.out.print(arr[i] + " ");
                    found = true;
                }
            }
        }
        if(!found){
            System.out.print("None");
        }
    }

    public static boolean isPrime(int num) {
        if(num <= 1) return false;

        for(int i=2; i*i <= num; i++) {
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}