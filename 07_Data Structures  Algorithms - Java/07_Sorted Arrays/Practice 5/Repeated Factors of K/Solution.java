import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        printRepeatedFactorsOfK(arr, k);
    }
    
    static void printRepeatedFactorsOfK(int[] arr, int k) {
        boolean found = false;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1]) {
                if(i == 1 || arr[i] != arr[i - 2]) {
                    if(arr[i] != 0 && k % arr[i] == 0) {
                        System.out.print(arr[i] + " ");
                        found = true;
                    }
                }
            }
        }
        if(!found) {
            System.out.print("None");
        }
    }
}