import java.util.Scanner;

class Main {
    
    public static void evenSubarray(int[] arr, int n){
        boolean found = false;
        for(int len=2; len<=n; len+=2){
            for(int i=0; i<=n-len; i++){
                found = true;
                StringBuilder sb = new StringBuilder();
                for(int j=i; j<i+len; j++){
                    sb.append(arr[j]).append(" ");
                }
                System.out.println(sb.toString().trim());
            }
        }

        if(!found)
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        evenSubarray(arr, n);
    }
}