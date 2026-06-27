import java.util.Scanner;

public class Main {

    public static void mergedArray(int[] arr1, int[] arr2, int n, int m){
        
        int[] mergedArr = new int[n+m];

        int k = 0;

        for(int i=0; i<n; i++){
            mergedArr[k] = arr1[i];
            k++;
        }
        for(int i=0; i<m; i++){
            mergedArr[k] = arr2[i];
            k++;
        }

        System.out.print("Merged array: ");
        for(int i=0; i<mergedArr.length; i++){
            System.out.print(mergedArr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] arr1 = new int[n];

        for(int i=0; i<n; i++){
            arr1[i]=scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i]=scanner.nextInt();
        }

        mergedArray(arr1, arr2, n, m);

    }
}