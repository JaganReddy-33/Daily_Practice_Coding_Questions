import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void findPositiveNegativePairs(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        List<int[]> pairs = new ArrayList<>();
        HashSet<Integer> visited = new HashSet<>();

        for (int num : arr) {
            int absVal = Math.abs(num);
            if (!visited.contains(absVal) && set.contains(-num) && num != 0) {
                pairs.add(new int[]{num, -num});
                visited.add(absVal);
            }
        }

        if (pairs.isEmpty()) {
            System.out.println("No Pairs found");
            return;
        }

        for (int[] pair : pairs) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        findPositiveNegativePairs(arr);
    }
}