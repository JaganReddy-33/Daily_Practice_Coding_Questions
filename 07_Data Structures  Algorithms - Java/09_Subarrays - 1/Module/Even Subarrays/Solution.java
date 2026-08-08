import java.util.Scanner;

class Main {

    public static void evenSubarray(int n, int[] arr){

        boolean found = false;
        for(int len=1; len<=n; len++){
            for(int i=0; i<=n-len; i++){
                int j = i+len-1;
                
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }
                if(isEven(sum)){
                    found = true;
                    for(int k=i; k<=j; k++){
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
        if(!found){
            System.out.print("None");
        }
    }

    private static boolean isEven(int n){
        if(n%2 == 0){
            return true; 
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr= new int[n];

        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        evenSubarray(n, arr);
    }
}