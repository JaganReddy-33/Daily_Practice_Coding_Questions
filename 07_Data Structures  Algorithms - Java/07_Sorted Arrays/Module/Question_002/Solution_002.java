import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void commonRepeatingOddEle(int[] arr1, int[] arr2, int n, int m){
        int i=0;
        int j=0;
        boolean found = false;
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                i++;
            } else if(arr1[i] > arr2[j]){
                j++;
            } else {
                if(arr1[i]%2 != 0){
                    System.out.print(arr1[i]+" ");
                    found = true;
                }
                i++;
                j++;
            }
        }
        if(!found){
            System.out.print("No common odd elements found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=scanner.nextInt();
        }

        int m =scanner.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i]=scanner.nextInt();
        }

        commonRepeatingOddEle(arr1, arr2, n, m);
    }
}