import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        mostRepeatedEle(arr, n);
    }

    public static void mostRepeatedEle(int[] arr, int n){
        int count = 1;
        int maxCount = 1;
        int maxElement = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }
        
        if (maxCount > 1) {
            System.out.println(maxElement);
        } else {
            System.out.println("-1");
        }
    }
}