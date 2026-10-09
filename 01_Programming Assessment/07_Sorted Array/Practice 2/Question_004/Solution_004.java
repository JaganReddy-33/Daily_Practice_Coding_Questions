import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        findLeastRepeatedElement(arr, n);
    }

    public static void findLeastRepeatedElement(int[] arr, int n) {
        if (n == 0) {
            System.out.println("-1");
            return;
        }

        int leastRepeated = -1;
        int minCount = Integer.MAX_VALUE;

        int currentElement = arr[0];
        int currentCount = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == currentElement) {
                currentCount++;
            } else {
                if (currentCount > 1 && currentCount < minCount) {
                    minCount = currentCount;
                    leastRepeated = currentElement;
                }
                currentElement = arr[i];
                currentCount = 1;
            }
        }

        if (currentCount > 1 && currentCount < minCount) {
            minCount = currentCount;
            leastRepeated = currentElement;
        }

        if (minCount != Integer.MAX_VALUE) {
            System.out.println(leastRepeated);
        } else {
            System.out.println("-1");
        }
    }
}