import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findSecondLargestIndex(arr, n));
    }

    public static int findSecondLargestIndex(int[] arr, int n) {
        int maxIndex = -1;
        int secondMaxIndex = -1;
        for (int i = 0; i < n; i++) {
            if (maxIndex == -1 || arr[i] > arr[maxIndex]) {
                secondMaxIndex = maxIndex;
                maxIndex = i;
            } else if (arr[i] < arr[maxIndex]) {
                if (secondMaxIndex == -1 || arr[i] > arr[secondMaxIndex]) {
                    secondMaxIndex = i;
                }
            }
        }
        return secondMaxIndex;
    }
}