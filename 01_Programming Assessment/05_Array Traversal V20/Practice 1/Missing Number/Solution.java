import java.util.Scanner;

class Main {

     static int missingNum(int N, int arr[]){
        int totalExceptedSum = 0;
        for(int i=1; i<=N+1; i++){
            totalExceptedSum += i;
        }

        int actualSum = 0;
        for(int i=0; i<N; i++){
            actualSum += arr[i];
        }
        return totalExceptedSum - actualSum;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(missingNum(N,arr)); 
    }

   
}