import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void repeatingEle(int[] arr1, int[] arr2, int n, int m){
        boolean[] visited = new boolean[m];
        for(int i=0; i<n; i++){
            for(int j=m-1; j>=0; j--){
                if(arr1[i] == arr2[j] && !visited[j]){
                    System.out.print(arr1[i]+" ");
                    visited[j] = true;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<arr1.length; i++){
            arr1[i]=scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<arr2.length; i++){
            arr2[i]=scanner.nextInt();
        }

        repeatingEle(arr1, arr2, n, m);
    }
}