import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();

        checkStrongNumber(n);
    }

    public static void checkStrongNumber(int n){
        int temp = n;
        long sum = 0;
        while(temp > 0){
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        if(sum == n){
            System.out.print("Strong Number");
        } else {
            System.out.print("Not Strong Number");
        }
    }

    public static int factorial(int num){
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact *= i;
        }
        return fact;
    }
}