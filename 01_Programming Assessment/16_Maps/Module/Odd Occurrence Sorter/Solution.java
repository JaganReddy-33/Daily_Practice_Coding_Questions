import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printOddOccurrences(arr);
    }

    public static void printOddOccurrences(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        boolean found = false;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                System.out.println(entry.getKey());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Repeating Elements");
        }
    }
}