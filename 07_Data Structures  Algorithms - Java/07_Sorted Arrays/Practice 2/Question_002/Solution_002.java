import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printOccurrencesOfRepeatedElements(arr, n);
    }

    public static void printOccurrencesOfRepeatedElements(int[] arr, int n) {
        boolean found = false;
        int i = 0;
        while (i < n) {
            int count = 1;
            while (i + 1 < n && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            if (count > 1) {
                System.out.println(arr[i] + " - " + count);
                found = true;
            }
            i++;
        }
        if (!found) {
            System.out.println("-1");
        }
    }
}