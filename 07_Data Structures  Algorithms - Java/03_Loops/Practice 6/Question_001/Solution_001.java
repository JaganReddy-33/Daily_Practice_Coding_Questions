import java.util.Scanner;
import java.math.BigInteger;

class Main {
    static BigInteger printFactorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        BigInteger res = printFactorial(n);
        System.out.println(res);
    }
}