import java.util.Scanner;

class Main {
    static int printFactorial(int n)
    {
		if(n == 0){
            return 1;
        }

        int fact = 1;
        for(int i=n; i>=1; i--){
            fact = fact * i;
        }
        return fact;
    }
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = printFactorial(n);
        System.out.println(res);
    }
}