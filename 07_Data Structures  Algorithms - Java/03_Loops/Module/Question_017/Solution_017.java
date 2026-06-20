import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFirstNPrimes(n);
    }

    public static void printFirstNPrimes(int n) {
        int count = 0;
        int num = 2;
        while(count < n){
            if(isPrime(num)){
                System.out.print(num+" ");
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int num){
        if(n<=1) return false;

        for(int i=2; i*i<= num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}