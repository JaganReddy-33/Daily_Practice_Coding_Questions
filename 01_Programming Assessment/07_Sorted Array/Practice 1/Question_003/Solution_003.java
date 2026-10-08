import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printUniqueElements(arr);
    }

    public static void printUniqueElements(int[] arr, n) {
        boolean found = false;

        for(int i=0; i<n; i++){
            boolean leftDiff = (i == 0) || (arr[i] != arr[i-1]);
            boolean rightDiff = (i == n-1) || (arr[i] != arr[i+1]);
            if(leftDiff && rightDiff){
                System.out.print(arr[i]+ " ");
                found = true;
            }
        }

        if(!found){
            System.out.print("-1");
        }
    }
}