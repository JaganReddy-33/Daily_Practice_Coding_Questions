import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printSumOddDigits(n);
    }

    public static void printSumOddDigits(int num){
        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            if(digit%2 != 0){
                sum +=digit;
            }
            num /= 10;
        }
        System.out.print(sum);
    }
}