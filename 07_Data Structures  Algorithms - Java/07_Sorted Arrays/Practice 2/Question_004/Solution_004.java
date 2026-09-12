import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printLeastRepeatedElement(arr);
    }
    static void printLeastRepeatedElement(int[] arr) {
        int count = 1;
        int minCount = Integer.MAX_VALUE;
        int minElement = -1;
        for(int i = 1; i <= arr.length; i++) {
            if(i < arr.length && arr[i] == arr[i - 1]) {
                count++;
            } else {
                if(count > 1 && count < minCount) {
                    minCount = count;
                    minElement = arr[i - 1];
                }
                count = 1;
            }
        }
        System.out.println(minElement);
    }
}