import java.util.Scanner;
public class Main {
    public static void findLCF(int a, int b){
        int hcf = findHCF(a, b);
        int lcm = (a*b) / hcf;
        System.out.print(lcm);
    }

    static int findHCF(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        findLCF(n, m);
    }
}