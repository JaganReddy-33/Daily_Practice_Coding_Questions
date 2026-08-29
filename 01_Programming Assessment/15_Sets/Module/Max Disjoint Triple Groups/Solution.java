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
        processAndPrintTripleGroups(arr);
    }

    private static void processAndPrintTripleGroups(int[] arr) {
        int groups = countMaxDisjointTripleGroups(arr);
        System.out.println(groups);
    }

    private static int countMaxDisjointTripleGroups(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;
        for (int num : arr) {
            int freq = freqMap.getOrDefault(num, 0) + 1;
            if (freq == 3) {
                count++;
                freqMap.clear();
            } else {
                freqMap.put(num, freq);
            }
        }
        return count;
    }
}