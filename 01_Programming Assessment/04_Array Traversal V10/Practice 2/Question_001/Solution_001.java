import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        boolean isOdd = false;
        for(int i=0; i<n; i++){
            if(arr[i]%2 != 0){
                System.out.print(arr[i]+" ");
                isOdd = true;
            }
        }
        if(!isOdd){
            System.out.print("None");
        }
    }
}