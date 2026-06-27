import java.util.*;

public class Main {

    public static void nonRepeatingEle(int[] arr1, int[] arr2, int n, int m){
        int i=0;
        int j=0;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            } else if(arr1[i]>arr2[j]){
                System.out.print(arr2[j]+" ");
                j++;
            } else {
                i++;
                j++;
            }
        }

        while(i<n){
            System.out.print(arr1[i]+" ");
            i++;
        }

        while(j<m){
            System.out.print(arr2[i]+" ");
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=scanner.nextInt();
        }

        int m =scanner.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i]=scanner.nextInt();
        }

        nonRepeatingEle(arr1, arr2, n, m);
       
    }
}