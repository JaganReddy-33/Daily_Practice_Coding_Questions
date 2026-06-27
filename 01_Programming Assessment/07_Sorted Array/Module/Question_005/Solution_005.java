import java.util.Scanner;

public class Main {

    public static void repeatingEle(int[] arr1, int[] arr2, int n, int m){
        boolean[] visited = new boolean[n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr2[i] == arr1[j] && !visited[j]){
                    System.out.print(arr2[i]+" ");
                    visited[j]=true;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i]=scanner.nextInt();
        }

        repeatingEle(arr1, arr2, n, m);
    }
}