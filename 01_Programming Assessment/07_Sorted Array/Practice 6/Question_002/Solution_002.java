import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        printPerfectSquareEle(arr, n);
    }

    public static void  printPerfectSquareEle(int[] arr, int n) {
        boolean found = false;

        for(int i=0; i<n; i++) {
            if(isPerfectSquare(arr[i])){
                System.out.print(arr[i] + " ");
                found = true;
            }
        }
        if(!found) {
            System.out.print("-1");
        }
    }

    public static boolean isPerfectSquare(int num){
        if(num < 0) return false;

        long sqrt =(long) Math.sqrt(num);
        return sqrt*sqrt == num;
    }
}