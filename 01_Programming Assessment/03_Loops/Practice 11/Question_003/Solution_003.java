import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPrimeDigits(n);
    }

    public static void printPrimeDigits(int num){
        boolean found = false;

        while(num > 0){
            int digit = num%10;
            if(digit==2 || digit==3 || digit==5 || digit==7){
                System.out.print(digit + " ");
                found = true;
            }
            num /= 10;
        }
        if(!found){
            System.out.print("No prime digits");
        }
    }
}