import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        printPairsPrimeFirst(arr, n);
    }

    public static void printPairsPrimeFirst(int[] arr, int n){
        boolean found = false;

        for(int i=0; i<n-1; i++){
            if(isPrime(arr[i])){
                for(int j=i+1; j<n; j++){
                    System.out.println(arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("None");
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