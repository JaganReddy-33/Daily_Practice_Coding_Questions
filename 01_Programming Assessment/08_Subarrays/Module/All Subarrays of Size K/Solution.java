import java.util.Scanner;

public class Main {

    static void subarrayOfSize(int[]arr, int size, int n) {
        for(int len=1; len<=n; len++){
            for(int start=0;  start<=n-len; start++){
                int end=start+len-1;

                if(len == size){
                    for(int k=start; k<=end; k++){
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		subarrayOfSize(arr,size, N);
    }
}