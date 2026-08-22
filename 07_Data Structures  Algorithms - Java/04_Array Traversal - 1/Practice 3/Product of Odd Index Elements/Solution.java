import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        if(n < 2){
            System.out.print(0);
            return;
        }
        long prod = 1;
        for(int i=0; i<n; i++){
            if(i%2 != 0){
                prod *= arr[i];
            }
        }
        System.out.print(prod);
    }
}