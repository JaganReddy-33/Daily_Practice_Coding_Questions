import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findLastFrequentElement(arr, n));
    }

    public static int findLastFrequentElement(int[] arr, int n) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int maxFreq = 0;
        int result = arr[0];
        for (int i = n - 1; i >= 0; i--) {
            int count = freqMap.get(arr[i]);
            if (count > maxFreq) {
                maxFreq = count;
                result = arr[i];
            }
        }
        return result;
    }
}