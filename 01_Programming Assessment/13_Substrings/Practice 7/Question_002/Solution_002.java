import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        
        subStringsGreaterThanK(s, k);
    }

    public static void subStringsGreaterThanK(String s, int k){

        int n = s.length();
        for (int len = k + 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                System.out.println(s.substring(i, i + len));
            }
        }
    }
}