import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        int k = scanner.nextInt();

        replaceDivisibleEle(arr, n, k);
    }

    public static void replaceDivisibleEle(int[] arr, int n, int k){
        for(int i=0; i<n; i++){
            if(arr[i]%k == 0){
                if(arr[i] < 0){
                    arr[i] = -k;
                } else {
                    arr[i] = k;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}