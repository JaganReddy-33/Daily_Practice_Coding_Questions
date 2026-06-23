import java.util.Scanner;
public class Main {

    public static void replaceEvenEle(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.print(0);
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }

        replaceEvenEle(arr);
    }
}