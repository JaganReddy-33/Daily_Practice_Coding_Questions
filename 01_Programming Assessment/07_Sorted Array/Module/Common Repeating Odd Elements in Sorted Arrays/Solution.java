import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void commonOddEle(int[] arr1, int[] arr2){
        boolean isFound = false;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j] && arr1[i]%2 != 0){
                    isFound = true;
                    System.out.print(arr1[i]+" ");
                }
            }
        }
        if(!isFound){
            System.out.print("No common odd elements found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i <n; i++){
            arr1[i]=scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i]=scanner.nextInt();
        }

        commonOddEle(arr1, arr2);
    }
}