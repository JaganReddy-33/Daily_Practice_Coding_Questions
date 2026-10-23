import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        printPrimeNumbersSubarrays(arr, n);
    }

    public static void printPrimeNumbersSubarrays(int[] arr, int n) {
        boolean found = false;

        for(int len=1; len<=n; len++){
            for(int i=0; i<=n-len; i++){
                int j = i+len-1;

                boolean allPrime = true;
                for(int m=i; m<=j; m++){
                    if(!isPrime(arr[m])){
                        allPrime = false;
                        break;
                    }
                }
                if(allPrime){
                    found = true;
                    for(int m=i; m<=j; m++){
                        System.out.print(arr[m] + " ");
                    }
                    System.out.println();
                }
            }
        }
        if(!found) {
            System.out.print("None");
        }
    }

    public static boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i=2; i*i<=num; i++){
            if(num%i == 0) return false;
        }
        return true;
    }
}