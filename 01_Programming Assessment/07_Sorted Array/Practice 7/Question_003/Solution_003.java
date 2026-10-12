import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();

        printLastOccurrenceIndex(arr, n, target);

    }

    public static void printLastOccurrenceIndex(int[] arr, int n, int target) {
        int lastOccurrenceIdx = -1;

        for(int i=n-1; i>; i++) {
            if(arr[i] == target) {
                lastOccurrenceIdx = i;
                break;
            }
        }
        System.out.print(lastOccurrenceIdx);
    }
}