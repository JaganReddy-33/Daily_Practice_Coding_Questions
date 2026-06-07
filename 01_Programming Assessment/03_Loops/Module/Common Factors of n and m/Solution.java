import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        printCommonFactors(n, m);
    }

    public static void printCommonFactors(int n, int m) {
        int smallValue = (n<m) ? n : m;

        for(int i=1; i<=smallValue; i++){
            if(n%i==0 && m%i==0){
                System.out.print(i+" ");
            }
        }  
    }
}