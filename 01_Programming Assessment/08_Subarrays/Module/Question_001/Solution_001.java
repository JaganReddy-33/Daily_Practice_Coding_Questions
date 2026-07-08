import java.util.Scanner;

public class Main {

    static void subarrayOfSize(int[]arr, int size) {
        
        boolean found = false;
        for(int i=arr.length-1; i>=0; i--){
            int sum = 0;
            for(int j=i; j>=0; j--){
                sum += arr[j];
                if(sum == size){
                    found = true;

                    for(int m=j; m<=i; m++){
                        System.out.print(arr[m]+" ");
                    }
                    System.out.println();
                }
            }
        }
        if(!found){
            System.out.print("None");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
        int k = scanner.nextInt();
		subarrayOfSize(arr,k);
    }
}