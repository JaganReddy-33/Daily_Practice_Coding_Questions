import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] arr = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextBoolean();
        }
        countTrueFalse(arr);
    }

    public static void countTrueFalse(boolean[] arr) {
        int trueCount = 0;
        int falseCount = 0;
        for (boolean val : arr) {
            if (val) {
                trueCount++;
            } else {
                falseCount++;
            }
        }
        System.out.println(trueCount + " " + falseCount);
    }
}