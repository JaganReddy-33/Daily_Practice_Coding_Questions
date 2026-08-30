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
        findMostFrequent(arr);
    }

    public static void findMostFrequent(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxCount = 0;
        int result = arr[0];
        for (int num : arr) {
            int count = map.get(num);
            if (count > maxCount) {
                maxCount = count;
                result = num;
            }
        }
        System.out.println(result);
    }
}