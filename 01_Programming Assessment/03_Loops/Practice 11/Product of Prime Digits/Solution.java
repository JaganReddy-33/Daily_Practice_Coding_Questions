import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printProductOfPrimeDigits(n);
    }

    public static void printProductOfPrimeDigits(int num){
        int product = 1;
        boolean hasPrime = false;
        while(num > 0){
            int digit = num%10;
            if(digit==2 || digit==3 || digit==5 || digit==7){
                product *= digit;
                hasPrime = true;
            }
            num = num/10;
        }

        if(hasPrime){
            System.out.print(product);
        } else {
            System.out.print("No prime digits");
        }
    }
}