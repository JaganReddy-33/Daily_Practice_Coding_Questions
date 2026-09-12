import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printFirstUniqueElement(arr);
    }
    static void printFirstUniqueElement(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            boolean leftDiff = (i == 0 || arr[i] != arr[i - 1]);
            boolean rightDiff = (i == arr.length - 1 || arr[i] != arr[i + 1]);
            if(leftDiff && rightDiff) {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("None");
    }
}