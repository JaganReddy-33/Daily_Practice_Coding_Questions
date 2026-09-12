import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printFirstRepeatingElement(arr);
    }
    static void printFirstRepeatingElement(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1]) {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("None");
    }
}