import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        processAndPrintUniqueSorted(arr);
    }

    public static void processAndPrintUniqueSorted(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }
        StringBuilder sb = new StringBuilder();
        for (int num : set) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}