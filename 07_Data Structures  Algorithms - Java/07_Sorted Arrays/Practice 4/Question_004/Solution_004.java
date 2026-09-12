import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printPrimeUniqueElements(arr);
    }
    
    static boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
    
    static void printPrimeUniqueElements(int[] arr) {
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            boolean leftDiff = (i == 0 || arr[i] != arr[i - 1]);
            boolean rightDiff = (i == arr.length - 1 || arr[i] != arr[i + 1]);
            
            if(leftDiff && rightDiff && isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }
        if(!found) {
            System.out.print("None");
        }
    }
}