import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printPrimeDigitSum(n);
    }

    public static void printPrimeDigitSum(int num){
        int sum = 0;
        while(num > 0){
            int digit = num%10;
            if(digit==2 || digit==3 || digit==5 || digit==7){
                sum += digit;
            }
            num = n/10;
        }
        System.out.println(sum);
    }
}