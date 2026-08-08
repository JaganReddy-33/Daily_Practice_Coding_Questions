import java.util.Scanner;

public class Main {

    static void subarrayOfSize(int[]arr, int k, int n) {
        for(int i=0; i<=n-k; i++){
            for(int j=i; j<i+k; j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		subarrayOfSize(arr,k, N);
    }
}