import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        findMostRepeatedElement(arr, n);
    }

    public static void findMostRepeatedElement(int[] arr, int n) {
        if (n == 0) {
            System.out.println("-1");
            return;
        }

        int mostRepeated = -1;
        int maxCount = 1;

        int currentElement = arr[0];
        int currentCount = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == currentElement) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mostRepeated = currentElement;
                }
                currentElement = arr[i];
                currentCount = 1;
            }
        }

        if (currentCount > maxCount) {
            maxCount = currentCount;
            mostRepeated = currentElement;
        }

        if (maxCount > 1) {
            System.out.println(mostRepeated);
        } else {
            System.out.println("-1");
        }
    }
}