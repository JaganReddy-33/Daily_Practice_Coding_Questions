import java.util.Scanner;

public class Main {

    public static void pairWithPrimeNumEle(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int num1 = arr[i];
                int num2 = arr[j];
                if(isPrime(num1) || isPrime(num2)){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n <= 1) return false;

        for(int i=2; i*i<= n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        pairWithPrimeNumEle(arr);
        
    }
}