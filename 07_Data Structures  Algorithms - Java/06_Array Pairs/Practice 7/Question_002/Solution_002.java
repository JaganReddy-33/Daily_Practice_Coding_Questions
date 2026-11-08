import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            set.add(arr[i]);
        }
        
        boolean found = false;
        HashSet<String> visitedPairs = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            int target = current - k;
            
            if (set.contains(target)) {
                int min = Math.min(current, target);
                int max = Math.max(current, target);
                String pairKey = min + "," + max;
                
                if (!visitedPairs.contains(pairKey)) {
                    visitedPairs.add(pairKey);
                    System.out.println(min + " " + max);
                    found = true;
                }
            }
        }
        
        if (!found) {
            System.out.println("No pairs found");
        }
    }
}