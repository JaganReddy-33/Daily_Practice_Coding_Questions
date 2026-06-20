import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a =sc.nextInt();
        int b = sc.nextInt();
        commonMultiples(n, a, b);
    }

    public static void commonMultiples(int n, int a, int b) {

        int gcd = findHCF(a, b);
        int lcm = (ab) / gcd;

        for(int i=1; i<=n; i++){
            System.out.print(lcm*i+" ");
        }
    }

    static int findHCF(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }






}