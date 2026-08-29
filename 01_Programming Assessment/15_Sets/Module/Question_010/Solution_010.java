import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        processAndPrintGroups(arr);
    }

    private static void processAndPrintGroups(int[] arr) {
        int count = countMaxDisjointGroups(arr);
        System.out.println(count);
    }

    private static int countMaxDisjointGroups(int[] arr) {
        int count = 0;
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                count++;
                seen.clear();
            } else {
                seen.add(num);
            }
        }
        return count;
    }
}