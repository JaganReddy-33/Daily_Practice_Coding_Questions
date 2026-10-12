import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] =scanner.nextInt();
        }
        int target = scanner.nextInt();

        printFirstOccurrenceIndex(arr, n, target);
    }

    public static void printFirstOccurrenceIndex(int[] arr, int n, int target){
        int firstOccurrenceIdx = -1;

        for(int i=0; i<n; i++){
            if(arr[i] == target){
                firstOccurrenceIdx = i;
                break;
            }
        }
        System.out.print(firstOccurrenceIdx);
    }
}