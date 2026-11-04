import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        countPalindromeSubstring(str);
    }

    public static void countPalindromeSubstring(String input) {
        int count = 0;
        int n = input.length();

        for(int i=0; i<n; i++){
            count += expandAroundCenter(input, i, i);

            count += expandAroundCenter(input, i, i+1);
        }
        System.out.print(count);
    }

    public static int expandAroundCenter(String input, int left, int right) {
        int count = 0;

        while(left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
            count++;
            left--;
            right++;
        }

        return count;
    }
}