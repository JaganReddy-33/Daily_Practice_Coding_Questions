import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        int i = 0;
        int j = 0;
        StringBuilder result = new StringBuilder();

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                result.append(a[i]).append(" ");
                i++;
            } else if (a[i] > b[j]) {
                result.append(b[j]).append(" ");
                j++;
            } else {
                i++;
                j++;
            }
        }

        while (i < n) {
            result.append(a[i]).append(" ");
            i++;
        }

        while (j < m) {
            result.append(b[j]).append(" ");
            j++;
        }

        System.out.println(result.toString().trim());
    }
}