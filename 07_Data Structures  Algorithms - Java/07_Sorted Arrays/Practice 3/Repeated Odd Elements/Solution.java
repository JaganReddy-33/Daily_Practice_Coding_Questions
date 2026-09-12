import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printRepeatedOddElements(arr);
    }
    static void printRepeatedOddElements(int[] arr) {
        boolean found = false;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1] && Math.abs(arr[i]) % 2 != 0) {
                if(i == 1 || arr[i] != arr[i - 2]) {
                    System.out.print(arr[i] + " ");
                    found = true;
                }
            }
        }
        if(!found) {
            System.out.print("None");
        }
    }
}