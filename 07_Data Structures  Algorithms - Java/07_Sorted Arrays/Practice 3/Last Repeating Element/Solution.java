import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printLastRepeatingElement(arr);
    }
    static void printLastRepeatingElement(int[] arr) {
        for(int i = arr.length - 1; i > 0; i--) {
            if(arr[i] == arr[i - 1]) {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("None");
    }
}