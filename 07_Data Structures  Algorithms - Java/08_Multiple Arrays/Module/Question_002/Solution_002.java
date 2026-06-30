import java.util.Scanner;

public class Main {

    public static void arrayMerger(int[] arr1, int[] arr2, int[] arr3, int n, int m, int k){
        int[] newArr = new int[n+m+k];
        int p = 0;

        for(int i=0; i<n; i++){
            newArr[p] = arr1[i];
            p++;
        }
        for(int i=0; i<m; i++){
            newArr[p] = arr2[i];
            p++;
        }
        for(int i=0; i<k; i++){
            newArr[p] = arr3[i];
            p++;
        }

        System.out.print("Merged array: ");
        for(int i=0; i<newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=scanner.nextInt();
        }

        int m =scanner.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i]=scanner.nextInt();
        }

        int k=scanner.nextInt();
        int[] arr3 = new int[k];
        for(int i=0; i<k; i++){
            arr3[i]=scanner.nextInt();
        }

        arrayMerger(arr1, arr2, arr3, n, m, k);
    }
}