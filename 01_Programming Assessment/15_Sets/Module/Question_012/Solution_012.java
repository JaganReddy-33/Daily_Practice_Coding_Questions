import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        processAndPrintPairs(arr);
    }

    private static void processAndPrintPairs(int[] arr) {
        int pairs = countPairs(arr);
        System.out.println(pairs);
    }

    private static int countPairs(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int totalPairs = 0;
        for (int count : freqMap.values()) {
            totalPairs += count / 2;
        }
        return totalPairs;
    }
}