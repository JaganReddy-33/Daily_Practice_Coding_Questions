import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printOddDigits(n);
    }

    public static void printOddDigits(int n) {
        boolean found = false;
        String numStr = String.valueOf(n);
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';

            if (digit % 2 != 0) {
                System.out.print(digit + " ");
                found = true;
            }
        }
        if(!found){
            System.out.print("No odd digits");
        }
    }
}