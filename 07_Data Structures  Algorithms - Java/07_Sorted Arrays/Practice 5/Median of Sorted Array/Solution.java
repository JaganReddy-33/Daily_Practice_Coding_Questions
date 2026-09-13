import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        System.out.print((n%2 != 0) ? arr[n/2] : (arr[(n/2)-1] + arr[n/2])/2);
    }
}